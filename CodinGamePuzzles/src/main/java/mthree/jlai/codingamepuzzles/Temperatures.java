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
 **/
class Temperatures {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt(); // the number of temperatures to analyse
        int ans = 0;
        List<Integer> ts = new ArrayList<>();
        int pos = 0;
        int neg = 0;
        int curr = 0;
        for (int i = 0; i < n; i++) {
            int t = in.nextInt(); // a temperature expressed as an integer ranging from -273 to 5526
            // System.out.println(t);
            
            ts.add(t);
        }

        if (ts.size() <= 0) {
            System.out.println(0);
        }

        ans = ts.get(0);
        for (int j = 0; j < ts.size(); j++) {
            
            curr = ts.get(j) * ts.get(j);
            if (curr <= ans * ans) {
                ans = ts.get(j);
                if (ts.get(j) < 0) {
                    neg = ts.get(j);
                } else if (ts.get(j) > 0) {
                    pos = ts.get(j);
                }
            }
        }
 
        if (neg != 0 && pos != 0) {
                if (neg * neg == pos * pos) {
                    ans = pos;
                }
            }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");
        

        System.out.println(ans);
    }
}
