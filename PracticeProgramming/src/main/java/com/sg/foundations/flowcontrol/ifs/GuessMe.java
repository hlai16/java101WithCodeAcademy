/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

/**
 *
 * @author glori
 */
public class GuessMe {
    public static void main(String[] args) {
        int ans = 9;
        Scanner userInput = new Scanner(System.in);
        int userNum;
        
        System.out.println("I've chosen a number. Betcha can't guess it!");
        userNum = Integer.parseInt(userInput.next());
        System.out.println("Your guess: " + userNum);
        
        if (userNum == ans) {
            System.out.println("Wow, nice guess! That was it!");
        }
        else if (userNum < ans) {
            System.out.println("Ha, nice try - too low! I chose " + ans + ".");
        }
        else if (userNum > ans) {
            System.out.println("Too bad, way too high. I chose " + ans + ".");
        }
    }
}
