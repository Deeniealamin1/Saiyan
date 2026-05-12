package com.pluralsight;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileManager {

    public static void saveBattleReport(ArrayList<Fighter> team) {

        try (BufferedWriter writer =
                     new BufferedWriter(new FileWriter("transactions.txt", true))) {

            writer.write("=== Battle Report ===\n");

            for (Fighter f : team) {
                writer.write(f.toString() + "\n");
            }

            writer.write("---------------------\n\n");

            System.out.println("Results successfully saved to transactions.txt");

        } catch (IOException e) {
            System.out.println("Error: Could not save to file.");
        }
    }
}