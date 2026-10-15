package com.firstapp.quarter2.minipeta3;

import java.util.Scanner;

public class ViewCatalog {

    public void start(Scanner scanner) {
        boolean running = true;

        while (running) {
            System.out.println("\n--- MAIN MENU ---");
            System.out.println("3: View Catalog");
            System.out.print("Enter Choice: ");

            int choice = Integer.parseInt(scanner.nextLine());
            System.out.println(choice); // Echo input

            if (choice == 3) {
                // Step 3: View Catalog
                System.out.println("\n--- BOOK CATALOG ---");
                System.out.println("- Noli Me Tangere (Filipino Literature)");
                System.out.println("- El Filibusterismo (Filipino Literature)");
            } else if (choice == 5) {
                // Exit the loop so the test can finish successfully
                running = false;
            }
        }
    }
}