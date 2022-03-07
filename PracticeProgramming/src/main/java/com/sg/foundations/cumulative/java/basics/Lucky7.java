/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.cumulative.java.basics;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author glori
 */
public class Lucky7 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Random randomizer = new Random();
        double userBets;
        int die1;
        int die2;
        int diceSum;
        int rolls = 0;
        
        int bestRoll = 0;
        
        System.out.println("How many dollars do you have? ");
        userBets = Double.parseDouble(userInput.next());
        double highestWin = userBets;
        
        while (userBets >= 0) {
            die1 = randomizer.nextInt(6);
            die2 = randomizer.nextInt(6);
            diceSum = die1 + die2;
            
            if (diceSum == 7) {
                userBets = userBets + 4;
                rolls++;
                bestRoll = rolls;
                if (highestWin < userBets) {
                    highestWin = userBets;
                }
            }
            
            userBets--;
            rolls++;
        }
        System.out.println("You are broke after " + rolls + " rolls. ");
        System.out.println("You should have quit after " + bestRoll + " rolls when you had $" + highestWin + ".");
    }
}
