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
public class oddadd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int sum=0;
        for (int i = 1; i < num; i++) {
            if(i%2!=0){
            sum +=i;
            }
        }System.out.println(sum);
    }
}
