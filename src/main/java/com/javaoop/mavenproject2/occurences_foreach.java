/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.javaoop.mavenproject2;
import java.util.Scanner;

/**
 *
 * @author humai
 */
public class occurences_foreach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to find occurences of: ");
        int find = sc.nextInt(); 
        System.out.print("Enter the elemnts of the array: ");
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
         arr[i]=sc.nextInt();
        }
        int occur=0;
        for (int num:arr) {
            if(num==find){
                occur++;
            }
        }
        System.out.println("The number " + find +" occured "+ occur + " times in the array.");
    }
}

