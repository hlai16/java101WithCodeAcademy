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
public class InterestCalculator {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        double initialAmt;
        int years = 0;
        int time = 1;
        double interest;
        
        System.out.println("How much do you want to invest? ");
        initialAmt = Double.parseDouble(userInput.next());
        
        System.out.println("How many years are you investing? ");
        years = Integer.parseInt(userInput.next());
        
        System.out.println("What is the annual interest rate % growth? ");
        interest = Double.parseDouble(userInput.next());
        
        System.out.println("Calculating... \n");
        
        double totalEarnings = initialAmt * (1 + (interest / 4 / 100));
        
        
        while (time <= years) {
            System.out.println("Year " + time + ": ");
            
            double interestEarned = totalEarnings - initialAmt;
            
            initialAmt = initialAmt + interestEarned;
            totalEarnings = totalEarnings + interestEarned;
            interestEarned++;
            
            System.out.println("Began with $" + initialAmt);
            System.out.println("Earned $" + interestEarned);
            System.out.println("Ended with $" + totalEarnings);
            
            
            time++;
        }
        
    }
}
