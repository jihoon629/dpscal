package com.example.dpscal;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DtoChrastat {

    @JsonProperty("name")
    private String name;

    @JsonProperty("HP")
    private int HP;

    @JsonProperty("ATK")
    private int ATK;

    @JsonProperty("DEF")
    private int DEF;

    @JsonProperty("CRIT")
    private int CRIT;

    @JsonProperty("HIT")
    private int HIT;

    @JsonProperty("EVA")
    private int EVA;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int hP) {
        HP = hP;
    }

    public int getATK() {
        return ATK;
    }

    public void setATK(int aTK) {
        ATK = aTK;
    }

    public int getDEF() {
        return DEF;
    }

    public void setDEF(int dEF) {
        DEF = dEF;
    }

    public int getCRIT() {
        return CRIT;
    }

    public void setCRIT(int cRIT) {
        CRIT = cRIT;
    }

    public int getHIT() {
        return HIT;
    }

    public void setHIT(int hIT) {
        HIT = hIT;
    }

    public int getEVA() {
        return EVA;
    }

    public void setEVA(int eVA) {
        EVA = eVA;
    }




    
}
