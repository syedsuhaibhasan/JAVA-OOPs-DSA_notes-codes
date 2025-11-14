/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.javaoop.mavenproject2.OOPs.nestedClasses;

/**
 *
 * @author humai
 */
public class Car {
    int noOfDoors;
    int noOfTires;
    class Tire{
        public void setTires(){
            noOfTires=2;
            System.out.printf("There are %d number of tires.",noOfTires);
        }
    }
}
