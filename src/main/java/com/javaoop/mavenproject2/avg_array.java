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
public class avg_array {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Please enter the "+(i+1)+". "+"element of the array: ");
            arr[i] = sc.nextInt();
        }
      int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        double avg = sum/arr.length;
        System.out.println("The average of the elements of the array is "+avg);
    }
}
