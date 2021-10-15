package com.example.websockettest.controllers;

import com.example.websockettest.messages.ReceiveChatMessage;
import com.example.websockettest.messages.SendChatMessage;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageExceptionHandler;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.messaging.simp.annotation.SendToUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.security.Principal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

@Controller
@CrossOrigin(origins = "http://localhost:7000")
public class ChatController {
    // allows us to programmatically send a message
    private final SimpMessagingTemplate simpMessagingTemplate;

    @Autowired
    public ChatController(SimpMessagingTemplate simpMessagingTemplate) {
        this.simpMessagingTemplate = simpMessagingTemplate;
    }

    /*
        From Spring tutorial - It's import to remark that, @SendToUser indicates that the return value of a
        message-handling method should be
        sent as a Message to the specified destination(s) prepended with “/user/{username}“ ???
     */
    /*
    @MessageMapping("/chat")
    @SendTo("/topic/chat")
    public void broadcastNews(@Payload String message) {
        this.simpMessagingTemplate.convertAndSend("/topic/party", message);
    }
    */
    @MessageMapping("/chat")
    public void processMessageToChat(
            @Payload String message
    ) throws Exception {
        String timeStamp = new SimpleDateFormat("MM.dd.HH.mm.ss").format(new Date());
        String sendMsg = "[" + timeStamp + "]-" + message;
        simpMessagingTemplate.convertAndSend("/topic/chat", sendMsg);
    }

    //instead of using SimpMessagingTemplate, we can use @SendTo or @SendToUser to determine destination
    @MessageMapping("/messages")
    public void processMessageFromClient (@Payload String message, SimpMessageHeaderAccessor sha) throws Exception {
        //ReceiveChatMessage response = new ReceiveChatMessage();
        //take message string and put in object?
        String user = sha.getUser().getName();
        System.out.println(user);
        String timeStamp = new SimpleDateFormat("MM.dd.HH.mm.ss").format(new Date());
        String sendMsg = "[" + timeStamp + "]-" + "From " + user + ":" + message;
        simpMessagingTemplate.convertAndSendToUser(sha.getUser().getName(), "/queue/message", sendMsg);
        // return "This is a user message";
    }

    @MessageMapping("/game-app")
    //@MessageMapping("/game-app/queue")
    public void send(SimpMessageHeaderAccessor sha, @Payload String sendToUser) {
        String message = "Hello from " + sha.getUser().getName();

        simpMessagingTemplate.convertAndSendToUser(sendToUser, "/queue/messages", message);
        //simpMessagingTemplate.convertAndSend("/topic/party", "This is a topic.party message");
    }

    @MessageExceptionHandler
    @SendToUser("/queue/errors")
    public String handleException(Throwable exception) {
        return exception.getMessage();
    }
}
