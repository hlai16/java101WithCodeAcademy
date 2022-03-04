/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.flowcontrol.random;

import java.util.Random;

/**
 *
 * @author glori
 */
public class CoinFlipper {
    public static void main(String[] args) {
       Random randomizer =  new Random();
    
    System.out.println("Ready, Set, Flip...");
    int x = randomizer.nextInt(2);
    
        switch(x) {
            case 0:
               System.out.println("HEAD");
               break;

            case 1:
                System.out.println("TAIL");
                break;
        }
    }
}
