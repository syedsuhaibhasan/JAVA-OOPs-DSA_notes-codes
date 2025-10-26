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
public class numberofoccureences {
     public static void main(String[] args) {  
Scanner sc = new Scanner(System.in);
         System.out.print("Please enter the number:");
         int num = sc.nextInt();
      int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Please enter the "+(i+1)+". "+"element of the array: ");
            arr[i] = sc.nextInt();
        }
        int count = 0;
         for (int i = 0; i < arr.length; i++) {
             if (arr[i]==num) {
                 count++;
             }
         }
         System.out.println("The number of occurences of the number " + "'" + num + "'" + " is " + count );
    }
}
