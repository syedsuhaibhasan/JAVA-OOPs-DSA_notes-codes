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
public class armstrongchecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        boolean isArmstrong = isArmstrong(num);
        if(isArmstrong){
            System.out.println("The number is an Armstrong number. ");}
        else {
            System.out.println("The number is not an Armstrong number. ");}
    }
    public static int countdigits(int num){
     int digit=0;
        while(num>0){
        digit++;
        num/=10;
        }
     return digit;
    }
    
    public static int pow(int num1, int num2){
    int result = 0;
        for (int i = 0; i<num2; i++) {
            result *= num1;
        }  
    return result;}
    
    public static boolean isArmstrong(int num){
    int noOfdigits = countdigits(num);
    int numcopy = num;
    int finalNo=0;
    while(num>0){
    int lastdigit = num%10;
    num/=10;
    finalNo += pow(lastdigit,noOfdigits);
    }    
    return finalNo==numcopy;}
}
