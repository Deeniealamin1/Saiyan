package com.pluralsight;

public class Fighter {

    private String name;
    private int strengthLevel;

    public Fighter(String name, int strengthLevel) {
        this.name = name;
        this.strengthLevel = strengthLevel;
    }

    public String getName() {
        return name;
    }

    public int getStrengthLevel() {
        return strengthLevel;
    }
}