/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.javaoop.mavenproject2;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author humai
 */
public class HCFcalculate {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        int hcf = HCF(a,b);
        System.out.println(hcf);
    }
    
    public static int HCF(int a, int b){
        /*for (int i = (a)*(b); i >= 1; i--) {
            if(a%i==0&&b%i==0){
            return i;}
        }*/
        int gcd = 1;
        int i = 1;
        while(i<=Math.min(a,b)){
            if (a%i==0&&b%i==0) {
                gcd = i;
            }
            i++;
}
    return gcd;
    }
}
