/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.javaoop.mavenproject2.OOPs.inheritence;

import java.util.Objects;

/**
 *
 * @author humai
 */
public class challenge2 {
    String name;
    int age;
    
     public challenge2(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(name,age);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final challenge2 other = (challenge2) obj;
        if (this.age != other.age) {
            return false;
        }
        return Objects.equals(this.name, other.name);
    }
    
    public static void main(String[] args) {
        challenge2 obj1 = new challenge2("Sohaib",19);
        challenge2 obj2 = new challenge2("Sohaib",19);
        if (obj1.equals(obj2)) {
            System.out.println("Equals");
        }else
            System.out.println("Not Equals");
        
        System.out.println("Hash code verification");
        if (obj1.hashCode()==obj2.hashCode()) {
            System.out.println("Equals");
        }else
            System.out.println("Not equal");
    }

}
