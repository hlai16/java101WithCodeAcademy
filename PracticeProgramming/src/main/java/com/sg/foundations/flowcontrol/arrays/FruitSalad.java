/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.flowcontrol.arrays;

/**
 *
 * @author glori
 */
public class FruitSalad {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        String[] fruit = {"Kiwi Fruit", "Gala Apple", "Granny Smith Apple", "Cherry Tomato", "Gooseberry", "Beefsteak Tomato", "Braeburn Apple", "Blueberry", "Strawberry", "Navel Orange", "Pink Pearl Apple",  "Raspberry", "Blood Orange", "Sungold Tomato", "Fuji Apple", "Blackberry", "Banana", "Pineapple", "Florida Orange", "Kiku Apple", "Mango", "Satsuma Orange", "Watermelon", "Snozzberry"};

        String[] fruitSalad;

        // Code Recipe for fruit salad should go here!
        int oranges = 0;
        int apples = 0;
        int others = 0;
        int berries = 0;
        int tomatoes = 0;
        
        for (int i = 0; i < fruit.length; i++) {
            if (fruit[i].contains("Orange")) {
                oranges++;
                System.out.print("Orange index: ");
                System.out.print(i + " ");
            } else if (fruit[i].contains("Apple")) {
                apples++;
                System.out.print("\nApple index: ");
                System.out.print(i + " ");
            } else if  (fruit[i].contains("berry")) {
                berries++;
                System.out.print("\nBerry index: ");
                System.out.print(i + " ");
                
            } else if (fruit[i].contains("Tomato")) {
                tomatoes++;
                System.out.print("\nTomato index: ");
                System.out.print(i + " ");
            } else {
                others++;
                System.out.print("\nOther index: ");
                System.out.print(i + " ");
            }
        }
        
        System.out.print("\nOranges: " + oranges + "; ");
        System.out.print("Apples: " + apples + "; ");
        System.out.print("Berries: " + berries + "; ");
        System.out.print("Tomatoes: " + tomatoes + "; ");
        System.out.print("Others: " + others + "; ");
        System.out.println("Total: " + fruit.length);
        
        
    }
}
