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
public class DoOrDoNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Should I do it? (y/n) ");
        boolean doIt;
        
        if (input.next().equals("y")) {
            doIt = true;
        } else {
            doIt = false;
        }
        
        boolean iDidIt = false;
        
        do {
            iDidIt = true;
            break; 
        } while (doIt);
        
        if (doIt && iDidIt) {
            System.out.println("I did it!");
        } else if (!doIt && iDidIt) {
            System.out.println("I know you said not, but I did it anyways.");
        } else {
            System.out.println("I didn't do it!");
        }
    }
}
