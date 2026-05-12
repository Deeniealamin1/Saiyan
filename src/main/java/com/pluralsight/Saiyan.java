package com.pluralsight;

public class Saiyan {
    private String name;
    private int powerLevel;
    private int health;

    public Saiyan(String name, int powerLevel, int health) {
        this.name = name;
        this.powerLevel = powerLevel;
        this.health = health;
    }

    public String getName() { return name; }
    public int getPowerLevel() { return powerLevel; }
    public int getHealth() { return health; }

    @Override
    public String toString() {
        return String.format("%s | Power: %d | HP: %d", name, powerLevel, health);
    }
}