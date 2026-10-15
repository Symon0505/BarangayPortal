package com.firstapp.quarter2.minipeta3;

import java.util.Scanner;

public class Inventory_Exit {

    public void start(Scanner scanner) {
        boolean running = true;

        while (running) {
            System.out.println("\n--- MAIN MENU ---");
            System.out.println("4: View Inventory | 5: Exit");
            System.out.print("Enter Choice: ");

            int choice = Integer.parseInt(scanner.nextLine());
            System.out.println(choice); // Echo input
            if (choice == 4) {
                // Step 4: View Inventory
                System.out.println("\n--- INVENTORY STATUS ---");
                System.out.println("Total Copies Available: 15");
                System.out.println("Copies Checked Out: 3");

            } else if (choice == 5) {
                // Step 5: Exit
                System.out.println("Exiting System... Goodbye!");
                running = false;


            } else if (choice == 4) {
                // Step 5: Exit System
                System.out.println("Exiting System... Goodbye!");
                running = false;

            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}