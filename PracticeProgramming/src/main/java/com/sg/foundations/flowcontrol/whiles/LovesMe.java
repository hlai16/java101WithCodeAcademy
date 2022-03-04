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
public class LovesMe {
    public static void main(String[] args) {
        
        int petals = 4;
        boolean pickPetal = false;
        
        System.out.println("Well here goes nothing...");
        
        do {
            pickPetal = true;
            System.out.println("It loves me NOT!");
            petals--;
            System.out.println("It LOVES me!");
        } while (petals > 0);
        
      
    }
}
