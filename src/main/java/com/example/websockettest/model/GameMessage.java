package com.example.websockettest.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class GameMessage{
    private Long id;
    private String type;
    private String body;
    private List<String> dest;


    public GameMessage (GameMessage msg){
        this.id = msg.getId();
        this.type = msg.getType();
        this.body = msg.getBody();
        this.dest = msg.getDest();
    }
}
