/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.utils;
import com.example.geometery.Circle;
import com.example.geometery.rectangle;
/**
 *
 * @author humai
 */
public class calculate {
    public static void main(String[] args) {
        Circle circle = new Circle(5.45);
        rectangle Rectangle = new rectangle(6,5);
        double circle_area = Math.pow(circle.radius,2)*circle.PIE;
        double Rectangle_area = Rectangle.length*Rectangle.width;
        System.out.println(circle_area);
        System.out.println(Rectangle_area);
    }
}
