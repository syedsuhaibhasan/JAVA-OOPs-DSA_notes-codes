/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.javaoop.mavenproject2.OOPs.AbstractionAndPolymorphisim;

public class Cricle extends Challenge1{
    int radius;

    public Cricle(int radius) {
        this.radius = radius;
    }
    
    @Override
    public void calculateArea() {
        int area = 2*radius;
    }
    public static void main(String[] args) {
        Cricle obj = new Cricle(3);
        obj.calculateArea();
    }
}
