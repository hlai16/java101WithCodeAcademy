/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.classes.objects;

/**
 *
 * @author glori
 */
public class Rectangle extends Shapes {
    String color = "green";
    double length = 20;
    double width = 12;
    
    @Override
    public double getArea() {
        area = length * width;
        return area;
    }
    
    @Override
    public double getPerimeter() {
        perimeter = (length + width) * 2;
        return perimeter;
    }
}
