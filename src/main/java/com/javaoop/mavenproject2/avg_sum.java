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
public class avg_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the element in " + i + " index of array:");
            arr[i]=sc.nextInt();
        }
        
        for (int num : arr) {
            System.out.println(num);
        }
    }
}
