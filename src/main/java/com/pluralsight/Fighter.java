package com.pluralsight;

public class Fighter {

    private String name;
    private int strengthLevel;

    public Fighter(String name, int strengthLevel) {

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }

        if (strengthLevel < 0) {
            throw new IllegalArgumentException("Strength cannot be negative.");
        }

        this.name = name;
        this.strengthLevel = strengthLevel;
    }

    public String getName() {
        return name;
    }

    public int getStrengthLevel() {
        return strengthLevel;
    }

    @Override
    public String toString() {
        return name + " | Power: " + strengthLevel;
    }
}