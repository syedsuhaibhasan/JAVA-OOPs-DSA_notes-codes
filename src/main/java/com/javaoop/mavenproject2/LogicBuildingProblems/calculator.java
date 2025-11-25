/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.javaoop.mavenproject2.LogicBuildingProblems;
import java.util.Scanner;
/**
 *
 * @author humai
 */
public class calculator {
    double a,b;
    
    public double add(int a,int b){
    double result = a+b;
    return result;} 
    
    public double subtract(int a,int b){
    double result = a-b;
    return result;} 
    
    public double multiply(int a,int b){
    double result = a*b;
    return result;} 
    
    public float divide(int a,int b){
        if (a>0||a<0&&a!=0) {
        float result = a/b;
            return result;
        }else{
            System.out.println("The numerator must not be equal to 0");
            return -1;
        }
    }       
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        calculator calculate = new calculator();
        System.out.print("Enter the expression to perform the arthmetic operation: ");
        char exp = sc.next().charAt(0);
        switch(exp){
            case '*'->System.out.print(calculate.multiply(4, 5));
            case '/'->System.out.print((float) calculate.divide(6, 5));
            case '-'->System.out.print(calculate.subtract(4, 5));
            case '+'->System.out.print(calculate.add(4, 5)); 
        }
    }
}
