/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.scanner;

import java.util.Scanner;

/**
 *
 * @author glori
 */
public class HealthyHearts {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int age;
        
        System.out.println("What is your age?");
        age = Integer.parseInt(userInput.next());
        
        int max = 220 - age;
        System.out.println("your maximum heartrate should be " + max + " beats per minute.");
        
        double zone50 = max / 2;
        double zone85 = max * 0.85;
        
        System.out.println("Your target HR zone is " + zone50 + " - " + zone85 + " beats per minute.");
    }
}
