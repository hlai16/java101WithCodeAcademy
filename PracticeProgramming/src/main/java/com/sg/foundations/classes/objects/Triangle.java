/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.classes.objects;

/**
 *
 * @author glori
 */
public class Triangle extends Shapes {
    String color = "orange";
    double height = 54;
    double base = 21;
    double side2 = 31;
    double side3 = 21;
    
    @Override
    public double getArea() {
        area = (height * base) / 2;
        return area;
    }
    
    @Override
    public double getPerimeter() {
        perimeter = base + side2 + side3;
        return perimeter;
    }
}
