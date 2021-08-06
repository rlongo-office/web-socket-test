package com.example.websockettest.controllers;

import com.example.websockettest.messages.ReceiveChatMessage;
import com.example.websockettest.messages.SendChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {

    @MessageMapping("/chat")
    @SendTo("/topic/chat")
    public ReceiveChatMessage handleChatMessage(SendChatMessage message) {
        return null;
    }
}
