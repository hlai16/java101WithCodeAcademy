/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.classes.objects;

/**
 *
 * @author glori
 */
public class Square extends Shapes {
    String color = "yellow";
    double length = 8;
    
    @Override
    public double getArea() {
        area = length * length;
        return area;
    }
    
    @Override
    public double getPerimeter() {
        perimeter = 4 * length;
        return perimeter;
    }
}
