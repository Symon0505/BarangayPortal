package com.firstapp.quarter2.minipeta3;

import java.util.Scanner;

public class LibraryMenu {

    public void start(Scanner scanner) {
        boolean running = true;

        while (running) {
            System.out.println("\n--- MAIN MENU ---");
            System.out.println("1. Create Profile | 2: Search Book | 3: View Catalog | 4: View Inventory | 5: Exit");
            System.out.print("Enter Choice: ");

            // Read choice and echo it to console
            int choice = Integer.parseInt(scanner.nextLine());
            System.out.println(choice); // Echo input

            // Step 1: Create Profile
            if (choice == 1) {
                System.out.print("Enter Name: ");
                String name = scanner.nextLine();
                System.out.println(name);

                System.out.print("Enter ID: ");
                String id = scanner.nextLine();
                System.out.println(id);
            }
// Step 2: Search Book
            else if (choice == 2) {
                System.out.print("Enter Book Title: ");
                String title = scanner.nextLine();
                System.out.println(title); // Echo input

                if (title.equalsIgnoreCase("Noli Me Tangere")) {
                    System.out.println("Result: Available in this category.");
                } else {
                    System.out.println("Result: Unavailable / Not in this category.");
                }
            }
// Step 3: View Catalog
            else if (choice == 3) {
                System.out.println("\n--- BOOK CATALOG ---");
                System.out.println("- Noli Me Tangere (Filipino Literature)");
                System.out.println("- El Filibusterismo (Filipino Literature)");
            }
// Step 4: View Inventory
            else if (choice == 4) {
                System.out.println("\n--- INVENTORY STATUS ---");
                System.out.println("Total Copies Available: 15");
                System.out.println("Copies Checked Out: 3");
            }
// Step 5: Exit
            else if (choice == 5) {
                System.out.println("Exiting System... Goodbye!");
                running = false;
            }
        }
    }
}
