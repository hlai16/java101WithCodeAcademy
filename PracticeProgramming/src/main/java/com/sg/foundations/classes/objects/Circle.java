/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.classes.objects;

/**
 *
 * @author glori
 */
public class Circle extends Shapes {
    String color = "pink";
    double PI = 3.14;
    double radius = 33;
    
    @Override
    public double getArea() {
        area = PI * radius * radius;
        return area;
    }
    
    @Override
    public double getPerimeter() {
        perimeter = 2 * PI * radius;
        return perimeter;
    }
}
