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
public class RockPaperScissors {
    public static void main(String[] args) {
            Scanner userInput = new Scanner(System.in);
            
            game();
        
            System.out.println("Another game? Y/N");
            String anotherRound;
            anotherRound = userInput.next();

            if (anotherRound.equals("Y") || anotherRound.equals("y")) {
                game();
            } else {
                System.out.println("Thanks for playing :)");
            }
    }
    
    public static int game() {
        Scanner userInput = new Scanner(System.in);
        
        int rounds;
        System.out.println("How many rounds you want to challenge me? ");
        rounds = Integer.parseInt(userInput.next());
        
        if (rounds < 1 || rounds > 10) {
            System.out.println("Error. not a valid answer. Goodbye.");
            return 0;
        } else {
            System.out.println("Ok! Let the game begin!");
            int tie = 0;
            int userWins = 0;
            int computerWins = 0;
            Random randomizer = new Random();


            while (rounds > 0) {
                int userPicks;
                int computerPicks;
                System.out.println("Rock - 0");
                System.out.println("Paper - 1");
                System.out.println("Scissors - 2");
                System.out.println("Choose your weapon: ");
                userPicks = Integer.parseInt(userInput.next());
                computerPicks = randomizer.nextInt(3);
                System.out.print("User: " + userPicks + "; Computer: " + computerPicks + " \n");

                if (computerPicks == userPicks) {
                    System.out.println("Tie");
                    tie++;
                } else if (computerPicks == 0 && userPicks == 1) {
                    System.out.println("User Win!");
                    userWins++;
                } else if (computerPicks == 1 && userPicks == 2) {
                    System.out.println("User Win!");
                    userWins++;
                } else if (computerPicks == 2 && userPicks == 0) {
                    System.out.println("User Win!");
                    userWins++;
                } else if (userPicks == 0 && computerPicks == 1) {
                    System.out.println("User Win!");
                    computerWins++;
                } else if (userPicks == 1 && computerPicks == 2) {
                    System.out.println("User Win!");
                    computerWins++;
                } else if (userPicks == 2 && computerPicks == 0) {
                    System.out.println("User Win!");
                    computerWins++;
                } 

                rounds--;
            }
            System.out.println("Game Over");
            System.out.println("Your wins: " + userWins);
            System.out.println("My wins: " + computerWins);
            System.out.println("Ties: " + tie);
            
            if (userWins > computerWins) {
                System.out.println("User WINS!!!!");
            } else if (userWins < computerWins) {
                System.out.println("Computer WINS!");
            } else {
                System.out.println("TIE. Nobody wins.");
            }
             
        }   
        return 0;
    } 
}
       

    
    

