package com.pluralsight;

public class Saiyan {

    private String name;
    private int powerLevel;
    private int health;

    public Saiyan(String name, int powerLevel, int health) {

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Saiyan name cannot be null or empty.");
        }

        if (powerLevel < 0) {
            throw new IllegalArgumentException("Power level cannot be negative.");
        }

        if (health < 0) {
            throw new IllegalArgumentException("Health cannot be negative.");
        }

        this.name = name;
        this.powerLevel = powerLevel;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    public int getHealth() {
        return health;
    }

    @Override
    public String toString() {
        return String.format("%s | Power: %d | HP: %d", name, powerLevel, health);
    }
}