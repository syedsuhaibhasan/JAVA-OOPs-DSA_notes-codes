package com.javaoop.mavenproject2.OOPs.AbstractionAndInterfaces;
//this class can only be inherited and not to be instantiaded
public abstract class Vehicle implements Transport{
        private int noOfTires;
    public Vehicle(int noOfTires) {
        this.noOfTires = noOfTires;
    }

    public int getNoOfTires() {
        return noOfTires;
    }

    public void setNoOfTires(int noOfTires) {
        this.noOfTires = noOfTires;
    }
    
    public void commute(){
        System.out.println("Going!");
    }
    //This an abstract method here there is no body code written just
    //mehtod declaration no definition
    public abstract void makeSound();
}
