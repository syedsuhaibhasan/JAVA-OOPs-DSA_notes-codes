/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.javaoop.mavenproject2;
import java.util.Scanner;

public class fibonacci_usingrecursions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbers you want to print: ");
        int count = sc.nextInt();
        for (int i = 1; i <= count; i++) {
            System.out.print(fibonacci(i)+" ");
        }
    }
    public static int fibonacci(int position){
        if (position==1) {
            return 0;
        }if (position==2) {
            return 1;
        }
        return fibonacci(position-1)+fibonacci(position-2);
    }
}
