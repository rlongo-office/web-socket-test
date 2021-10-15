package com.example.websockettest.model;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;


public class Character {
    Boolean active;
    String backStory;
    String role;
    String name;
    User player;
    String gender;
    Stat age;
    String hair;
    String eyes;
    String skin;
    Stat height;
    Stat weight;
    String alignment;
    Stat size;
    String[] diety;
    ArrayList<Stat> race;
    Integer reach;
    Stat experience;
    String[] auras;
    String[] senses;
    Stat hitpoint;
    Integer damage;
    Purse purse;
    String[] languages;
    String[] toolProfs;
    String[] weaponProfs;
    String[] armorProfs;
    ArrayList<Attribute> abilities;
    ArrayList<Attribute> abilityMods;
    ArrayList<Skill> skills;
    String[] allSaves;
    Stat armorClass;
    Stat initiative;
    Stat speed;
    Stat encumbrance;
    Float carriedWeight;
    ArrayList<Inventory> inventories;
    ArrayList<Spell> spells;


    public Character(Boolean active, String backStory, String role, String name, User player, String gender,
                     Stat age, String hair, String eyes, String skin, Stat height, Stat weight, String alignment,
                     Stat size, String[] diety, ArrayList<Stat> race, Integer reach, Stat experience, String[] auras,
                     String[] senses, Stat hitpoint, Integer damage, Purse purse, String[] languages,
                     String[] toolProfs, String[] weaponProfs, String[] armorProfs, ArrayList<Attribute> abilities,
                     ArrayList<Attribute> abilityMods, ArrayList<Skill> skills, String[] allSaves, Stat armorClass,
                     Stat initiative, Stat speed, Stat encumbrance, Float carriedWeight,
                     ArrayList<Inventory> inventories, ArrayList<Spell> spells) {
        this.active = active;
        this.backStory = backStory;
        this.role = role;
        this.name = name;
        this.player = player;
        this.gender = gender;
        this.age = age;
        this.hair = hair;
        this.eyes = eyes;
        this.skin = skin;
        this.height = height;
        this.weight = weight;
        this.alignment = alignment;
        this.size = size;
        this.diety = diety;
        this.race = race;
        this.reach = reach;
        this.experience = experience;
        this.auras = auras;
        this.senses = senses;
        this.hitpoint = hitpoint;
        this.damage = damage;
        this.purse = purse;
        this.languages = languages;
        this.toolProfs = toolProfs;
        this.weaponProfs = weaponProfs;
        this.armorProfs = armorProfs;
        this.abilities = abilities;
        this.abilityMods = abilityMods;
        this.skills = skills;
        this.allSaves = allSaves;
        this.armorClass = armorClass;
        this.initiative = initiative;
        this.speed = speed;
        this.encumbrance = encumbrance;
        this.carriedWeight = carriedWeight;
        this.inventories = inventories;
        this.spells = spells;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getBackStory() {
        return backStory;
    }

    public void setBackStory(String backStory) {
        this.backStory = backStory;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getPlayer() {
        return player;
    }

    public void setPlayer(User player) {
        this.player = player;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Stat getAge() {
        return age;
    }

    public void setAge(Stat age) {
        this.age = age;
    }

    public String getHair() {
        return hair;
    }

    public void setHair(String hair) {
        this.hair = hair;
    }

    public String getEyes() {
        return eyes;
    }

    public void setEyes(String eyes) {
        this.eyes = eyes;
    }

    public String getSkin() {
        return skin;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public Stat getHeight() {
        return height;
    }

    public void setHeight(Stat height) {
        this.height = height;
    }

    public Stat getWeight() {
        return weight;
    }

    public void setWeight(Stat weight) {
        this.weight = weight;
    }

    public String getAlignment() {
        return alignment;
    }

    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }

    public Stat getSize() {
        return size;
    }

    public void setSize(Stat size) {
        this.size = size;
    }

    public String[] getDiety() {
        return diety;
    }

    public void setDiety(String[] diety) {
        this.diety = diety;
    }

    public ArrayList<Stat> getRace() {
        return race;
    }

    public void setRace(ArrayList<Stat> race) {
        this.race = race;
    }

    public Integer getReach() {
        return reach;
    }

    public void setReach(Integer reach) {
        this.reach = reach;
    }

    public Stat getExperience() {
        return experience;
    }

    public void setExperience(Stat experience) {
        this.experience = experience;
    }

    public String[] getAuras() {
        return auras;
    }

    public void setAuras(String[] auras) {
        this.auras = auras;
    }

    public String[] getSenses() {
        return senses;
    }

    public void setSenses(String[] senses) {
        this.senses = senses;
    }

    public Stat getHitpoint() {
        return hitpoint;
    }

    public void setHitpoint(Stat hitpoint) {
        this.hitpoint = hitpoint;
    }

    public Integer getDamage() {
        return damage;
    }

    public void setDamage(Integer damage) {
        this.damage = damage;
    }

    public Purse getPurse() {
        return purse;
    }

    public void setPurse(Purse purse) {
        this.purse = purse;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public String[] getToolProfs() {
        return toolProfs;
    }

    public void setToolProfs(String[] toolProfs) {
        this.toolProfs = toolProfs;
    }

    public String[] getWeaponProfs() {
        return weaponProfs;
    }

    public void setWeaponProfs(String[] weaponProfs) {
        this.weaponProfs = weaponProfs;
    }

    public String[] getArmorProfs() {
        return armorProfs;
    }

    public void setArmorProfs(String[] armorProfs) {
        this.armorProfs = armorProfs;
    }

    public ArrayList<Attribute> getAbilities() {
        return abilities;
    }

    public void setAbilities(ArrayList<Attribute> abilities) {
        this.abilities = abilities;
    }

    public ArrayList<Attribute> getAbilityMods() {
        return abilityMods;
    }

    public void setAbilityMods(ArrayList<Attribute> abilityMods) {
        this.abilityMods = abilityMods;
    }

    public ArrayList<Skill> getSkills() {
        return skills;
    }

    public void setSkills(ArrayList<Skill> skills) {
        this.skills = skills;
    }

    public String[] getAllSaves() {
        return allSaves;
    }

    public void setAllSaves(String[] allSaves) {
        this.allSaves = allSaves;
    }

    public Stat getArmorClass() {
        return armorClass;
    }

    public void setArmorClass(Stat armorClass) {
        this.armorClass = armorClass;
    }

    public Stat getInitiative() {
        return initiative;
    }

    public void setInitiative(Stat initiative) {
        this.initiative = initiative;
    }

    public Stat getSpeed() {
        return speed;
    }

    public void setSpeed(Stat speed) {
        this.speed = speed;
    }

    public Stat getEncumbrance() {
        return encumbrance;
    }

    public void setEncumbrance(Stat encumbrance) {
        this.encumbrance = encumbrance;
    }

    public Float getCarriedWeight() {
        return carriedWeight;
    }

    public void setCarriedWeight(Float carriedWeight) {
        this.carriedWeight = carriedWeight;
    }

    public ArrayList<Inventory> getInventories() {
        return inventories;
    }

    public void setInventories(ArrayList<Inventory> inventories) {
        this.inventories = inventories;
    }

    public ArrayList<Spell> getSpells() {
        return spells;
    }

    public void setSpells(ArrayList<Spell> spells) {
        this.spells = spells;
    }

    @Override
    public String toString() {
        return "Character{" +
                "active=" + active +
                ", backStory='" + backStory + '\'' +
                ", role='" + role + '\'' +
                ", name='" + name + '\'' +
                ", player=" + player +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", hair='" + hair + '\'' +
                ", eyes='" + eyes + '\'' +
                ", skin='" + skin + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", alignment='" + alignment + '\'' +
                ", size=" + size +
                ", diety=" + Arrays.toString(diety) +
                ", race=" + race +
                ", reach=" + reach +
                ", experience=" + experience +
                ", auras=" + Arrays.toString(auras) +
                ", senses=" + Arrays.toString(senses) +
                ", hitpoint=" + hitpoint +
                ", damage=" + damage +
                ", purse=" + purse +
                ", languages=" + Arrays.toString(languages) +
                ", toolProfs=" + Arrays.toString(toolProfs) +
                ", weaponProfs=" + Arrays.toString(weaponProfs) +
                ", armorProfs=" + Arrays.toString(armorProfs) +
                ", abilities=" + abilities +
                ", abilityMods=" + abilityMods +
                ", skills=" + skills +
                ", allSaves=" + Arrays.toString(allSaves) +
                ", armorClass=" + armorClass +
                ", initiative=" + initiative +
                ", speed=" + speed +
                ", encumbrance=" + encumbrance +
                ", carriedWeight=" + carriedWeight +
                ", inventories=" + inventories +
                ", spells=" + spells +
                '}';
    }
}
