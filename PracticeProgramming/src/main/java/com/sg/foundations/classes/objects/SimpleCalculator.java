/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.classes.objects;

import java.util.Scanner;

/**
 *
 * @author glori
 */
public class SimpleCalculator {
    
    // App
    public static void main(String[] args) {
        
       App();
    }
    
    public static void App() {
        Scanner userInput = new Scanner(System.in);
        double num1;
        double num2;
        String userChoice;
        
        System.out.println("\nWelcome to Simple Calculator. How can I help you?");
        System.out.println("Please select one of the following options: ");
        System.out.println("Press 'a': Addition; ");
        System.out.print("Press 'b': Subtration; \n");
        System.out.print("Press 'c': Multiplication; \n");
        System.out.print("Press 'd': Division; \n");
        System.out.print("Press 'e': Exit Simple Calculator. \n");
        userChoice = userInput.next();
        
        if (userChoice.equals("a") || userChoice.equals("A")) {
            System.out.println("You choose addition. ");
            System.out.println("num1 + num2 ");
            System.out.println("Your num1 is? ");
            num1 = Double.parseDouble(userInput.next());
            System.out.println("Your num2 is? ");
            num2 = Double.parseDouble(userInput.next());
            add(num1, num2);
            App();
        } else if (userChoice.equals("b") || userChoice.equals("B")) {
            System.out.println("You choose subtraction. ");
            System.out.println("num1 - num2 ");
            System.out.println("Your num1 is? ");
            num1 = Double.parseDouble(userInput.next());
            System.out.println("Your num2 is? ");
            num2 = Double.parseDouble(userInput.next());
            minus(num1, num2);
            App();
        } else if (userChoice.equals("c") || userChoice.equals("C")) {
            System.out.println("You choose multiplication. ");
            System.out.println("num1 x num2 ");
            System.out.println("Your num1 is? ");
            num1 = Double.parseDouble(userInput.next());
            System.out.println("Your num2 is? ");
            num2 = Double.parseDouble(userInput.next());
            times(num1, num2);
            App();
        } else if (userChoice.equals("d") || userChoice.equals("D")) {
            System.out.println("You choose division. ");
            System.out.println("num1 / num2 ");
            System.out.println("Your num1 is? ");
            num1 = Double.parseDouble(userInput.next());
            System.out.println("Your num2 is? ");
            num2 = Double.parseDouble(userInput.next());
            divide(num1, num2);
            App();
        } else if (userChoice.equals("e") || userChoice.equals("E")) {
            System.out.println("Thank you for using Simple Calculator. Have a nice Day!");
        } else {
            System.out.println("Invalid entry. ");
            App();
        }
    }
    
    public static double add(double num1, double num2) {
        System.out.println(num1 + " + " + num2 + " = ");
        System.out.print(num1 + num2);
        return num1 + num2;
    }
    
    public static double minus(double num1, double num2) {
        System.out.println(num1 + " - " + num2 + " = ");
        System.out.print(num1 - num2);
        return num1 - num2;
    }
    public static double times(double num1, double num2) {
        System.out.println(num1 + " x " + num2 + " = ");
        System.out.print(num1 * num2);
        return num1 * num2;
    }
    public static double divide(double num1, double num2) {
        System.out.println(num1 + " / " + num2 + " = ");
        System.out.print(num1 / num2);
        return num1 / num2;
    }
}
