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
public class PassingTheTuringTest {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        String username, color, fruit;
        int num = 0;
        
        System.out.println("Hello there!");
        System.out.println("What's your name? ");
        username = userInput.next();
        
        System.out.println("Hi, " + username + "! I'm Joan.");
        System.out.println("What's your favorite color? ");
        color = userInput.next();
        
        System.out.println("Huh, " + color + "? Mine's Tomato.");
        
        System.out.println("I really like oranges. They're my favorite fruit, too.");
        System.out.println("What's YOUR favorite fruit, " + username + "? ");
        fruit = userInput.next();
        
        System.out.println("Really? " + fruit + "? That's wild!");
        System.out.println("Speaking of favorites, what's your favorite number? ");
        num = Integer.parseInt(userInput.next());
        
        int ans = num * 5;
        
        System.out.println(num + " is a cool number. Mine's 5.");
        System.out.println("Did you know " + num + " X 5 is " + ans + "? That's a cool number too!");
        
        System.out.println("Well, thanks for talking to me, " + username + "!");
    }
}
