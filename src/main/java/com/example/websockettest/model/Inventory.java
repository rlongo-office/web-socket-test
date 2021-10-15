package com.example.websockettest.model;

public class Inventory {
    String name;
    Float quantity;
    Float weight;
    Float cost;
    String gearType;
    String description;

    public Inventory(String name, Float quantity, Float weight,
                     Float cost, String gearType, String description) {
        this.name = name;
        this.quantity = quantity;
        this.weight = weight;
        this.cost = cost;
        this.gearType = gearType;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getQuantity() {
        return quantity;
    }

    public void setQuantity(Float quantity) {
        this.quantity = quantity;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public Float getCost() {
        return cost;
    }

    public void setCost(Float cost) {
        this.cost = cost;
    }

    public String getGearType() {
        return gearType;
    }

    public void setGearType(String gearType) {
        this.gearType = gearType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", weight=" + weight +
                ", cost=" + cost +
                ", gearType='" + gearType + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
