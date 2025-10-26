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
public class palindrome_using_recursions {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        String num = sc.next();
        boolean isPalindrome =  isPalindrome(num);
        if (isPalindrome) {
            System.out.println("The number is a palindrome.");
        }else{
        System.out.println("The number is not a palindrome.");
        }
    }
        public static boolean isPalindrome(String num){
            if (num.length()<=1) {
                return true;
            }
            if (num.charAt(0)!= num.charAt(num.length()-1)) {
                return false;
            }
            String newStr = num.substring(1, num.length()-1);
        return isPalindrome(newStr);}
}
