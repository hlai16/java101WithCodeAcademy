/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.flowcontrol.fors;

import java.util.Scanner;

/**
 *
 * @author glori
 */
public class FizzBuzz {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int num = 0;
        
        System.out.println("How many fizzing and buzzing unit?");
        num = Integer.parseInt(userInput.next());
        int count = 1;
        
        System.out.println(0);
        while (count <= num) {
            
            if (count % 3 == 0 && count % 5 == 0) {
                System.out.println("Fizz Buzz");
            } else if (count % 5 == 0) {
                System.out.println("Buzz");
            } else if (count % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(count);
            }
            count ++;
        }
        System.out.println("TRADITION!");
    }
}
