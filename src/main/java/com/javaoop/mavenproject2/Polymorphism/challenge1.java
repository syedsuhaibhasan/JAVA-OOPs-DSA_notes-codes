//              QUESTION
/*
85. In a class Calculator, create multiple add() methods that
overload each other and can sum two integers, three
integers, or two doubles. Demonstrate how each can be
called with different numbers of parameters.
*/
package com.javaoop.mavenproject2.Polymorphism;
public class challenge1 {
   public int add(int a, int b){
   return a+b;
   }
   
   public int add(int a,int b, int c){
   return a + b + c;
   }
   
   public double add(double a, double b){
   return a + b;
   }
   
    public static void main(String[] args) {
        challenge1 obj = new challenge1();
        System.out.println(obj.add(1, 1));
        System.out.println(obj.add(2.3, 2.69));
        System.out.println(obj.add(3, 2, 1));        
    }
}
