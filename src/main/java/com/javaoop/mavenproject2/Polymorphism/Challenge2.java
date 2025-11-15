//                    QUESTION
/*
86. Define a base class Vehicle with a method service() and a
subclass Car that overrides service(). In Car's service(),
provide a specific implementation that calls super.service()
as well, to show how overriding works.
*/
package com.javaoop.mavenproject2.Polymorphism;
public class Challenge2 {
    public void service(){
        System.out.println("Change oil");
    }
}
