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
public class palindrome_check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int num = sc.nextInt();
        boolean isPalindrome =  isPalindrome(num);
        if (isPalindrome) {
            System.out.println("The number is a palindrome.");
        }else{
        System.out.println("The number is not a palindrome.");
        }
    }
   public static boolean isPalindrome(int num){
   int reversed = Palindrome(num);
       System.out.println(reversed);
    return num==reversed;}
   
   public static int Palindrome(int num){
   int reverse = 0;
   while(num>0){
   int digit = num % 10;
   reverse = reverse*10+digit;
   num /=10;
   }    
   return reverse;}
}
