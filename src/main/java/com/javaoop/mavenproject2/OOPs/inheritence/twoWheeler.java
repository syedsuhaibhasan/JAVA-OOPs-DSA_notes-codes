/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.javaoop.mavenproject2.OOPs.inheritence;

/**
 *
 * @author humai
 */
//subclass
public class twoWheeler extends vehicle{
    int doors=2;
    public void doors(){
        System.out.printf("this has %d doors only",doors);
    }
    twoWheeler(){
    //subclass sets value for super class variable in constructor
//    noOfWheels=2;
     //access modifirer changed
     setnoOfWheels(2);
    }
}
