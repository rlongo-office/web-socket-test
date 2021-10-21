package com.example.websockettest.model;

public class Skill {
    String name;
    Stat stat;
    Integer passive;
    String description;

    public Skill() {
    }

    public Skill(String name, Stat stat, Integer passive, String description) {
        this.name = name;
        this.stat = stat;
        this.passive = passive;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Stat getStat() {
        return stat;
    }

    public void setStat(Stat stat) {
        this.stat = stat;
    }

    public Integer getPassive() {
        return passive;
    }

    public void setPassive(Integer passive) {
        this.passive = passive;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Skill{" +
                "name='" + name + '\'' +
                ", stat=" + stat +
                ", passive=" + passive +
                ", description='" + description + '\'' +
                '}';
    }
}
