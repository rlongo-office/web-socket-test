package com.example.websockettest.Service;

import com.example.websockettest.model.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.SimpleDateFormat;
import java.util.Date;


public class MessageFactory {
    private String strMessage;
    private GameMessage inMessage;

    @Autowired
    ObjectMapper objMapper = new ObjectMapper();

    public MessageFactory() {
    }

    public MessageFactory convertToGameMessage(String stringMessage){
        try {
            this.inMessage = objMapper.readValue(stringMessage, GameMessage.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return this;
    }

    public String processOutboundGameMessage(){
        switch( this.inMessage.getType()){
            case "party":
            case "private":
                GameMessage chatMsg = addSystemTime( new GameMessage(inMessage)); // = new AbstractMessage((inMessage)).addMessageTime();
                return convertMessageToString(chatMsg);
            case "action":
            case "character":
            case "map":
            case "lore":
            default: return null;
        }
    }

    public GameMessage addSystemTime(GameMessage msg){
        String timeStamp = new SimpleDateFormat("MM.dd.HH.mm.ss").format(new Date());
        String chat = "[" + timeStamp + "]-" + msg.getBody();
        msg.setBody(chat);
        return msg;
    }

    public String convertMessageToString(GameMessage msg){
        String strMsg = "";
        try {
             strMsg = objMapper.writeValueAsString(msg);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            return strMsg;
        }
    }

    /*Getters and Setters */

    public String getStrMessage() {
        return strMessage;
    }

    public void setStrMessage(String strMessage) {
        this.strMessage = strMessage;
    }

    public GameMessage getInMessage() {
        return inMessage;
    }

    public void setInMessage(GameMessage inMessage) {
        this.inMessage = inMessage;
    }

}
