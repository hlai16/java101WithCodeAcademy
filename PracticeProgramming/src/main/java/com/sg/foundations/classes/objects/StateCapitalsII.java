/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.classes.objects;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author glori
 */
public class StateCapitalsII {
    public static void main(String[] args) throws FileNotFoundException {
        
        Map<String, String> states = new HashMap<>();
        
        Scanner scan = new Scanner(
            new BufferedReader(new FileReader("StateCapitals.txt")));
        
        while (scan.hasNextLine()) {
            String currentLine = scan.nextLine();
            
            System.out.println(currentLine);
        }
        
        
    }
}
