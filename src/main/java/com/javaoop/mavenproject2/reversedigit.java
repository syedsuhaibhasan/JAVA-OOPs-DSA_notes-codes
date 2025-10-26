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
public class reversedigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int reverse = 0;
        while(num>0){
        int digit = num%10;
        reverse = reverse*10+digit;
        num/=10;
            System.out.println(reverse);
        }
        
    }
}
