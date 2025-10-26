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
public class fibonacciseries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = sc.nextInt();
        if (num<0)return;
        System.out.print("0 ");
        if (num==0) return;
        System.out.print("1 ");
        int first = 0, second = 1;
            while(first+second<num){
                System.out.print(first+second+" ");
                int third = first+second;
                first=second;
                second=third;
                
        }
    }
}
 