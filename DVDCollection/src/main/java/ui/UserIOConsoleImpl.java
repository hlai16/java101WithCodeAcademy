/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import java.util.Scanner;

/**
 *
 * @author glori
 */
public class UserIOConsoleImpl implements UserIO {
    Scanner userInput = new Scanner(System.in);

    @Override
    public void print(String msg) {
        System.out.println(msg);
    }

    @Override
    public double readDouble(String prompt) {
        System.out.println(prompt);
        double num = Integer.parseInt(userInput.nextLine());
        return num;
    }

    @Override
    public double readDouble(String prompt, double min, double max) {
        System.out.println(prompt);
        double num = Integer.parseInt(userInput.nextLine());
        return num;
    }

    @Override
    public float readFloat(String prompt) {
        System.out.println(prompt);
        float num = Integer.parseInt(userInput.nextLine());
        return num;
    }

    @Override
    public float readFloat(String prompt, float min, float max) {
        System.out.println(prompt);
        float num = Integer.parseInt(userInput.nextLine());
        return num;
    }

    @Override
    public int readInt(String prompt) {
        System.out.println(prompt);
        int num = Integer.parseInt(userInput.nextLine());
        return num;
    }

    @Override
    public int readInt(String prompt, int min, int max) {
        System.out.println(prompt);
        int num = Integer.parseInt(userInput.nextLine());
        return num;
    }

    @Override
    public long readLong(String prompt) {
        System.out.println(prompt);
        long num = Integer.parseInt(userInput.nextLine());
        return num;
    }

    @Override
    public long readLong(String prompt, long min, long max) {
        System.out.println(prompt);
        long num = Integer.parseInt(userInput.nextLine());
        return num;
    }

    @Override
    public String readString(String prompt) {
        System.out.println(prompt);
        String response = userInput.nextLine();
        return response;
    }

    @Override
    public void printInt(int num) {
        System.out.println(num);
    }
    
}
