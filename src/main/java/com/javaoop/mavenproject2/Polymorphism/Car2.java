package com.javaoop.mavenproject2.Polymorphism;
public class Car2 extends Challenge2{

    @Override
    public void service() {
        super.service();
        System.out.println("Change Filter");
    }
    public static void main(String[] args) {
        Car2 obj = new Car2();
        obj.service();
    }
}
