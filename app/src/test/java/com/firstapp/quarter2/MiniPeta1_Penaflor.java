package com.firstapp.quarter2;
import org.junit. Test;

public class MiniPeta1_Penaflor {
    @Test
    public void printMyProfileO() {
        // --- 1. THE INPUT (storing your personal details in variables) ---
        String myName = "Penaflor";
        String petName = "Pao Pao";
        String favFood = "Pork Steak";
        int myAge = 17;

        // 2. THE OUTPUT (Printing to the console)
        System.out.println("---MY DIGITAL PROFILE---");
        System.out.println("Hello,my name is " + myName + " and I am " + myAge + " years old.");
        System.out.println("I have a wonderful pet named " + petName + ".");
        System.out.println("If I could, I would eat " + favFood + " every single day!");
    }
}