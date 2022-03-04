/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.flowcontrol.whiles;

import java.util.Scanner;

/**
 *
 * @author glori
 */
public class StayPositive {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
    
        int countFrom;
    
        System.out.println("What number should I count from? ");
        countFrom = Integer.parseInt(userInput.next());
        
        System.out.println("Here goes!");
        
        while(countFrom > 0) {
            System.out.println(countFrom);
            countFrom--;
        }
        System.out.println("Blast Off!");
    }
}
