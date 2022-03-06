/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.cumulative.java.basics;

import java.util.Scanner;

/**
 *
 * @author glori
 */
public class Factorizer {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int num;
        int factors = 0;
        int sumFactors = 0;
        
        System.out.println("What number would you like to factor? ");
        num = Integer.parseInt(userInput.next());
        System.out.println("The factors of " + num + " are: \n");
        
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
                factors++;
                sumFactors = sumFactors + i;
            }
            
        }
        System.out.println(num + " has " + factors + " factors.");
        
        if (sumFactors % num == 0) {
            System.out.println(num + " is a perfect number.");
        } else {
            System.out.println(num + " is not a perfect number.");
        }
        if (factors > 2 || factors < 2) {
            System.out.println(num + " is not a prime number.");
        } else {
            System.out.println(num + "is a prime number.");
        }
    }
}
