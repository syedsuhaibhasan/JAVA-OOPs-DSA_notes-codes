/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.javaoop.mavenproject2.OOPs.inheritence;

/**
 *
 * @author humai
 */
public class inheritance_test {
    public static void main(String[] args) {
        vehicle obj1 = new vehicle();
        twoWheeler obj2 = new twoWheeler();
        motorcycle obj3 = new motorcycle();
        //super class variable in use
        System.out.println(obj1.getNoOfWheels());
        //subclass uses superclass methods 
        
        obj1.commute();
        System.out.println("");
        //since obj2 sts tires to 2 when running through subclass it will use 2 tires
        obj2.commute();
        System.out.println("");
        //although obj3 is subclass of twoWheeler still usees methods and variables of supperclass
        obj3.commute();
        System.out.println("");
        //obj3 uses obj2 method
        obj3.doors();
        System.out.println("");
        obj2.doors();
    }
}
