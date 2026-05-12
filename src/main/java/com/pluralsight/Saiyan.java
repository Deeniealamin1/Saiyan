package com.pluralsight;

public class Saiyan extends Fighter {

    private int health;

    public Saiyan(String name, int powerLevel, int health) {
        super(name, powerLevel);

        if (health < 0) {
            throw new IllegalArgumentException("Health cannot be negative.");
        }

        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public int getPowerLevel() {
        return getStrengthLevel();
    }

    @Override
    public String toString() {
        return "[Saiyan] " + getName()
                + " | Power: " + getPowerLevel()
                + " | HP: " + health;
    }
}