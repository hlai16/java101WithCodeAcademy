/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.flowcontrol.whiles;

/**
 *
 * @author glori
 */
public class BewareTheKraken {
    public static void main(String[] args) {
        System.out.println("Time to dive!");
        
        int depthDiveInFt = 0;
        
        // 36200ft is the deepest survey
        while (depthDiveInFt < 36200) {
            System.out.println("So far, we've swum " + depthDiveInFt + " feet");
            
            if (depthDiveInFt >= 20000) {
                System.out.println("Uhhh, I think i see a Kraken, guys .... Ahhhhhhhh!!!");
                break;
            }
            
            // I swim like a turbo
            depthDiveInFt += 1000;
        }
        System.out.println("We ended up swimming " + depthDiveInFt + " feet down.");
    }
}
