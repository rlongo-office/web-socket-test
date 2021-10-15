package com.example.websockettest.model;

public class Stat {
    Float raw;      //non adjusted value
    Float adj;      //adjusted value

    public Stat(String name, Float raw, Float adj) {
        this.raw = raw;
        this.adj = adj;
    }

    public Float getRaw() {
        return raw;
    }

    public void setRaw(Float raw) {
        this.raw = raw;
    }

    public Float getAdj() {
        return adj;
    }

    public void setAdj(Float adj) {
        this.adj = adj;
    }

    @Override
    public String toString() {
        return "Stat{" +
                ", raw=" + raw +
                ", adj=" + adj +
                '}';
    }
}
