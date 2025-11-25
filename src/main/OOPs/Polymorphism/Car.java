package com.javaoop.mavenproject2.Polymorphism;
public class Car extends Vehicle{
    public int noOfDoors(){
    return 3;
    }
    // testing method overriding
    @Override
    public void start() {
        System.out.println("Car is starting");
    }
    
    
}
