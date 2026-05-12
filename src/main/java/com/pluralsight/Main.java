package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Fighter> team = new ArrayList<>();

        boolean running = true;

        while (running) {

            System.out.println("\n=== DBZ Battle Arena ===");
            System.out.println("1) Create Saiyan");
            System.out.println("2) Create Namekian");
            System.out.println("3) View Team");
            System.out.println("4) Calculate Total Team Power");
            System.out.println("5) Start Battle");
            System.out.println("6) Save Battle Report");
            System.out.println("0) Exit");

            System.out.print("Selection: ");

            String choice = scanner.nextLine();

            switch (choice) {

                case "1":

                    try {

                        System.out.print("Enter Saiyan name: ");
                        String name = scanner.nextLine();

                        System.out.print("Enter power level: ");
                        int power = Integer.parseInt(scanner.nextLine());

                        System.out.print("Enter health: ");
                        int health = Integer.parseInt(scanner.nextLine());

                        team.add(new Saiyan(name, power, health));

                        System.out.println(name + " has been added to your team");

                    } catch (Exception e) {
                        System.out.println("Invalid input.");
                    }

                    break;

                case "2":

                    try {

                        System.out.print("Enter Namekian name: ");
                        String name = scanner.nextLine();

                        System.out.print("Enter power level: ");
                        int power = Integer.parseInt(scanner.nextLine());

                        System.out.print("Enter health: ");
                        int health = Integer.parseInt(scanner.nextLine());

                        System.out.print("Enter regeneration: ");
                        int regen = Integer.parseInt(scanner.nextLine());

                        team.add(new Namekian(name, power, health, regen));

                        System.out.println(name + " has been added to your team");

                    } catch (Exception e) {
                        System.out.println("Invalid input.");
                    }

                    break;

                case "3":

                    if (team.isEmpty()) {
                        System.out.println("No fighters found.");
                    } else {
                        for (Fighter f : team) {
                            System.out.println(f);
                        }
                    }

                    break;

                case "4":

                    long total = BattleArena.calculateTotalPower(team);
                    System.out.println("Total Team Power: " + total);

                    break;

                case "5":

                    BattleArena.startBattle(team);

                    break;

                case "6":

                    FileManager.saveBattleReport(team);

                    break;

                case "0":

                    running = false;
                    System.out.println("Exiting...");

                    break;

                default:

                    System.out.println("Invalid choice.");
            }
        }

        scanner.close();
    }
}