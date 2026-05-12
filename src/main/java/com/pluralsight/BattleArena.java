package com.pluralsight;

import java.util.ArrayList;

public class BattleArena {

    public static int calculateTotalPower(ArrayList<Saiyan> team) {
        return team.stream().mapToInt(Saiyan::getPowerLevel).sum();
    }

    public static void startBattle(ArrayList<Saiyan> team) {
        if (team.isEmpty()) {
            System.out.println("The arena is empty! Create a team first.");
            return;
        }
        System.out.println("--- The Battle Begins ---");
        System.out.println("Your team of " + team.size() + " enters the fray!");
    }
}