package com.example.websockettest.Service;

import com.example.websockettest.model.StompMessage;
import com.example.websockettest.model.StompChatMessage;
import com.example.websockettest.model.StompCharacterMessage;
import com.example.websockettest.model.StompActionMessage;
import com.example.websockettest.model.StompMapMessage;
import com.example.websockettest.model.StompLoreMessage;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public class StompMessageFactory {
    private String strMessage;
    private StompMessage inMessage;
    private StompMessage outMessage;
    @Autowired
    ObjectMapper objMapper;

    public StompMessageFactory(String inMsg) {
        convertToStompMessage(inMsg);
        outMessage = returnOutStompMessage(inMessage);

    }

    public void convertToStompMessage(String stringMessage){
        try {
            this.inMessage = objMapper.readValue(stringMessage, StompMessage.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

    public StompMessage processOutboundStompMessage(StompMessage inMessage){
        switch( inMessage.getType()){
            case "party":
            case "private":
                return new StompChatMessage(inMessage);
            case "action": return new StompActionMessage();
            case "character": return new StompCharacterMessage();
            case "map": return new StompMapMessage();
            case "lore": return new StompLoreMessage();
            default: return new StompMessage();
        }
    }


    public StompMessage returnOutStompMessage(StompMessage inMessage){
        switch( inMessage.getType()){
            case "party":
            case "private":
                return new StompChatMessage();
            case "action": return new StompActionMessage();
            case "character": return new StompCharacterMessage();
            case "map": return new StompMapMessage();
            case "lore": return new StompLoreMessage();
            default: return new StompMessage();
        }
    }

}
