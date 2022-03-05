/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.flowcontrol.whiles;

import java.util.Random;

/**
 *
 * @author glori
 */
public class LazyTeenager {
    public static void main(String[] args) {
        Random randomizer = new Random();
        
        boolean momWarning = false;
        int momWarned = 0;
        int getCleaning = 0;
        
        do {
            momWarning = true;
            momWarned++;
            System.out.println("Clean your room! (X" + momWarned + ")");
            boolean cleaning = randomizer.nextBoolean();
            getCleaning += 10;
            
            if (cleaning && momWarned < 7) {
                System.out.println("FINE! I am going to clean :@"); 
                break;
            } else if (!cleaning && momWarned >= 7) {
                System.out.println("You're grounded. No more XBox and Evony!");
                break;
            }
           
        } while (momWarned < 7);
        
        
    }
}
