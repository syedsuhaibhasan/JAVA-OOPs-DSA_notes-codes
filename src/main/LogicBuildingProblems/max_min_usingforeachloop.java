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
public class max_min_usingforeachloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.print("Enter the element of the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Finding max and min values");
        int max=arr[0];
        int min=arr[0];
        for (int num : arr) {
            if (max<num) {
                max=num;
            }
            if (min>num) {
                min=num;
            }
        }
        System.out.println("The max element in the array is: " + max);
        System.out.println("The min element in the array is: " + min);
    }
}
