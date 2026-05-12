package com.pluralsight;

public class Namekian extends Fighter {

    private int health;
    private int regeneration;

    public Namekian(String name, int powerLevel, int health, int regeneration) {
        super(name, powerLevel);

        if (health < 0) {
            throw new IllegalArgumentException("Health cannot be negative.");
        }

        if (regeneration < 0) {
            throw new IllegalArgumentException("Regeneration cannot be negative.");
        }

        this.health = health;
        this.regeneration = regeneration;
    }

    public int getHealth() {
        return health;
    }

    public int getRegeneration() {
        return regeneration;
    }

    public int getPowerLevel() {
        return getStrengthLevel();
    }

    public void regenerate() {
        health += regeneration;
    }

    @Override
    public String toString() {
        return "[Namekian] " + getName()
                + " | Power: " + getPowerLevel()
                + " | HP: " + health
                + " | Regen: " + regeneration;
    }
}