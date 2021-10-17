package com.example.websockettest.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


public class StompMessage {
    protected Integer id;
    protected String type;
    protected String body;
    protected String[] dest;

    public StompMessage(){
        this.id = null;
        this.type ="";
        this.body ="";
        this.dest= new String[0];
    }

    public StompMessage(Integer id, String type, String body, String[] dest) {
        this.id = id;
        this.type = type;
        this.body = body;
        this.dest = dest;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String[] getDest() {
        return dest;
    }

    public void setDest(String[] dest) {
        this.dest = dest;
    }

    @Override
    public String toString() {
        return "StompMessage{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", body='" + body + '\'' +
                ", dest='" + dest + '\'' +
                '}';
    }
}
