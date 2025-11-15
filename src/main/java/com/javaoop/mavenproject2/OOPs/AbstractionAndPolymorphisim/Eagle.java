package com.javaoop.mavenproject2.OOPs.AbstractionAndPolymorphisim;
public class Eagle extends Bird {

    @Override
    public void fly() {
        System.out.println("Flying....");
    }
    
    public static void main(String[] args) {
        Eagle obj = new Eagle();
        obj.fly();
    }
}
