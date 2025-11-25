package com.javaoop.mavenproject2.OOPs.AbstractionAndInterfaces;
public class Car extends Vehicle {
    private int noOfDoors;
    public Car() {
        super(4);
    }
    //abstracted method gives definition
    @Override
    public void makeSound() {
        System.out.println("vroom....");
    }
    //This method was declared in interface(transport)
    //TThen implemented by Vehicle abstract class (super class of Car)
    //now finally defined in Car class and cannot be defined in superclass
    //because super class is an abstract class 
    @Override
    public void getSetGo() {
        System.out.println("Get Set Go");
    }
    
}
