package com.firstapp.quarter2.minipeta3;

import java.util.Scanner;

public class SearchBook {

    public void start(Scanner scanner) {
        boolean running = true;

        while (running) {
            System.out.println("\n--- MAIN MENU ---");
            System.out.println("2: Search Book");
            System.out.print("Enter Choice: ");

            int choice = Integer.parseInt(scanner.nextLine());
            System.out.println(choice); // Echo input

        if (choice == 2) {
            // Step 2: Search Book
            System.out.print("Enter Book Title: ");
            String title = scanner.nextLine();
            System.out.println(title);

            if (title.equalsIgnoreCase("Noli Me Tangere")) {
                System.out.println("Result: Available in this category.");
            } else {
                System.out.println("Result: Unavailable / Not in this category.");
            }
        }
    }
    }
}
