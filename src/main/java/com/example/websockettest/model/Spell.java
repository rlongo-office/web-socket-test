package com.example.websockettest.model;

import java.util.Arrays;
import java.util.List;

public class Spell {
     String name;
     String castTime;
     Float range;
     Integer dc;
     Integer casterLevel;
     List<String> components;
     List<String> schools;
     Integer castsLeft;
     Boolean unlimited;
     String description;
     List<String> traits;

     public Spell(){}

    public Spell(String name, String castTime, Float range, Integer dc, Integer casterLevel, List<String> components, List<String> schools, Integer castsLeft, Boolean unlimited, String description, List<String> traits) {
        this.name = name;
        this.castTime = castTime;
        this.range = range;
        this.dc = dc;
        this.casterLevel = casterLevel;
        this.components = components;
        this.schools = schools;
        this.castsLeft = castsLeft;
        this.unlimited = unlimited;
        this.description = description;
        this.traits = traits;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCastTime() {
        return castTime;
    }

    public void setCastTime(String castTime) {
        this.castTime = castTime;
    }

    public Float getRange() {
        return range;
    }

    public void setRange(Float range) {
        this.range = range;
    }

    public Integer getDc() {
        return dc;
    }

    public void setDc(Integer dc) {
        this.dc = dc;
    }

    public Integer getCasterLevel() {
        return casterLevel;
    }

    public void setCasterLevel(Integer casterLevel) {
        this.casterLevel = casterLevel;
    }

    public List<String> getComponents() {
        return components;
    }

    public void setComponents(List<String> components) {
        this.components = components;
    }

    public List<String> getSchools() {
        return schools;
    }

    public void setSchools(List<String> schools) {
        this.schools = schools;
    }

    public Integer getCastsLeft() {
        return castsLeft;
    }

    public void setCastsLeft(Integer castsLeft) {
        this.castsLeft = castsLeft;
    }

    public Boolean getUnlimited() {
        return unlimited;
    }

    public void setUnlimited(Boolean unlimited) {
        this.unlimited = unlimited;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getTraits() {
        return traits;
    }

    public void setTraits(List<String> traits) {
        this.traits = traits;
    }

    @Override
    public String toString() {
        return "Spell{" +
                "name='" + name + '\'' +
                ", castTime='" + castTime + '\'' +
                ", range=" + range +
                ", dc=" + dc +
                ", casterLevel=" + casterLevel +
                ", components=" + components +
                ", schools=" + schools +
                ", castsLeft=" + castsLeft +
                ", unlimited=" + unlimited +
                ", description='" + description + '\'' +
                ", traits=" + traits +
                '}';
    }
}
