/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mthree.jlai.codingamepuzzles;

/**
 *
 * @author glori
 */
import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 * ---
 * Hint: You can use the debug stream to print initialTX and initialTY, if Thor seems not follow your orders.
 **/
class Thor {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int lightX = in.nextInt(); // the X position of the light of power
        int lightY = in.nextInt(); // the Y position of the light of power
        int initialTx = in.nextInt(); // Thor's starting X position
        int initialTy = in.nextInt(); // Thor's starting Y position

        // game loop
        while (true) {
            // String [] direction = {"N", "NE", "E", "SE", "S", "SW", "W", "NW"};
            // String ans = direction[0];
            String xDirect = "";
            String yDirect = "";
            int remainingTurns = in.nextInt(); // The remaining amount of turns Thor can move. Do not remove this line.

            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");
            if (initialTx < lightX) {
                xDirect = "E";
                initialTx++;
            } else if (initialTx > lightX) {
                xDirect = "W";
                initialTx--;
            } 
            

            if (initialTy < lightY) {
                yDirect = "S";
                initialTy++;
            } else if (initialTy > lightY) {
                yDirect = "N";
                initialTy--;
            } 
            
            // A single line providing the move to be made: N NE E SE S SW W or NW
            System.out.println(yDirect + xDirect);
        }
    }
}