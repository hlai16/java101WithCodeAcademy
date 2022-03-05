/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.flowcontrol.methods;

import java.util.Random;

/**
 *
 * @author glori
 */
public class BarelyControlledChaos {
    public static void main(String[] args) {

        String color = colorChoices(); // call color method here
        String animal = animalChoices(); // call animal method again here
        String colorAgain = colorChoices(); // call color method again here
        int weight = getNumber(1, 100); // call number method,
            // with a range between 5 - 200
        int distance = getNumber(44, 80); // call number method,
            // with a range between 10 - 20
        int number = getNumber(99, 123); // call number method,
            // with a range between 10000 - 20000
        int time = getNumber(5, 90); // call number method,
            // with a range between 2 - 6            

        System.out.println("Once, when I was very small...");

        System.out.println("I was chased by a " + color + ", "
            + weight + "lb " + " miniature " + animal
            + " for over " + distance + " miles!!");

        System.out.println("I had to hide in a field of over "
            + number + " " + colorAgain + " poppies for nearly "
            + time + " hours until it left me alone!");

        System.out.println("\nIt was QUITE the experience, "
            + "let me tell you!");
    }

    // ??? Method 1 ???
    public static String colorChoices() {
        Random randomizer = new Random();
        String color1 = "Magenta";
        String color2 = "Blue";
        String color3 = "Bubblegum";
        String color4 = "Beige";
        String color5 = "Lemonchiffon";
        
        int choice = randomizer.nextInt(5);
        
        if (choice == 0) {
            return color1;
        } else if (choice == 1) {
            return color2;
        } else if (choice == 2) {
            return color3;
        } else if (choice == 3) {
            return color4;
        } else if (choice == 4) {
            return color5;
        }
        return null;
    }
    
    // ??? Method 2 ???
    public static String animalChoices() {
        Random randomizer = new Random();
        String animal1 = "Walrus";
        String animal2 = "Seagull";
        String animal3 = "Port-Belly Piglet";
        String animal4 = "Wallaby";
        String animal5 = "Gorilla";
        
        int choice = randomizer.nextInt(5);
        
        if (choice == 0) {
            return animal1;
        } else if (choice == 1) {
            return animal2;
        } else if (choice == 2) {
            return animal3;
        } else if (choice == 3) {
            return animal4;
        } else if (choice == 4) {
            return animal5;
        }
        return null;
    }
    
    // ??? Method 3 ???
    public static int getNumber(int min, int max) {
        Random randomizer = new Random();
        
        for (int i = min; i < max; i++) {
            
            return i;
            
        }
        return 0;
        
    }
}
