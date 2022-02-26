/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mthree.jlai.windowmaster;

import java.util.Scanner;

/**
 *
 * @author glori
 */
public class WindowsMaster {
    public static void main(String [] args) {
        float height;
        float width;
        
        // for getting input from users:
        String stringHeight;
        String stringWidth;
        
        float areaOfWindow;
        float cost;
        float perimeterOfWindow;
        
        // to get input, we need to initialize Scanner
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter window height:");
        stringHeight = myScanner.nextLine();
        System.out.println("Please enter window width:");
        stringWidth = myScanner.nextLine();
        
        //in order to do math with user input, must convert string to float
        height = Float.parseFloat(stringHeight);
        width = Float.parseFloat(stringWidth);
        
        //area formula:
        areaOfWindow = height * width;
        
        //perimeter formula:
        perimeterOfWindow = 2 * (height + width);
        
        // cost
        cost = ((3.50f * areaOfWindow) + (2.25f * perimeterOfWindow));
        
        //display results
        System.out.println("Window height = " + stringHeight);
        System.out.println("Window width = " + stringWidth);
        System.out.println("Window area = " + areaOfWindow);
        System.out.println("Window perimeter = " + perimeterOfWindow);
        System.out.println("Total Cost = " + cost);
    }
}
