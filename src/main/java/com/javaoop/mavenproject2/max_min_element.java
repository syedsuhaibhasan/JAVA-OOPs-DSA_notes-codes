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
public class max_min_element {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
      int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Please enter the "+(i+1)+". "+"element of the array: ");
            arr[i] = sc.nextInt();
        }
        int max=arr[0];
        int min =arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
            max=arr[i];
            }
            if (arr[i]<min) {
                min=arr[i];
            }
        }
        System.out.println("The max element in the array is "+ max);
        System.out.println("The min element in the array is "+min);
    }
}
