package com.example.websockettest.model;

import java.text.SimpleDateFormat;
import java.util.Date;


public class StompChatMessage extends StompMessage {

    public StompChatMessage(StompMessage inMessage){
        this.id = inMessage.getId();
        this.body = inMessage.getBody();
        this.dest = inMessage.getDest();
        this.type = inMessage.getType();
    }

    public StompChatMessage(){
        super();
    }

    public void processOutboundChatMessage(){
        this.addMessageTime();
    }

    public void addMessageTime(){
        String timeStamp = new SimpleDateFormat("MM.dd.HH.mm.ss").format(new Date());
        String chat = "[" + timeStamp + "]-" + this.getBody();
        this.setBody(chat);
    }

    public StompChatMessage addMessageTime(StompChatMessage stompChatMessage){
        String timeStamp = new SimpleDateFormat("MM.dd.HH.mm.ss").format(new Date());
        String chat = "[" + timeStamp + "]-" + stompChatMessage.getBody();
        stompChatMessage.setBody(chat);
        return stompChatMessage;
    }
}
