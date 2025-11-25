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
public class primechecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = sc.nextInt();
        for (int i = 2; i <= a-1; i++) {
            if (a%i==0) {
                System.out.println("The number is not a prime number");
                break;
            }
            else {System.out.println("The number is a prime number");}
        }
    }
}
