/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.javaoop.mavenproject2.OOPs.inheritence;
//super class
public class vehicle {
    private int noOfWheels;
    //previous- int noOfWheels
    
    public int getNoOfWheels() {
        return noOfWheels;
    }
    //now child cannot access this variable directly it has to use setter function
    public void setnoOfWheels(int noOfWheels){
    this.noOfWheels=noOfWheels;
    }
    public void commute(){
        System.out.printf("The vehicle is moving using %d tires", noOfWheels);
    }
}
