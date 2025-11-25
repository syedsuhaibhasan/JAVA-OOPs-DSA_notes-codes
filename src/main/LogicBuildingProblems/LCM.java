package com.javaoop.mavenproject2.LogicBuildingProblems;

import java.util.Scanner;

/**
 *
 * @author humai
 */
public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter your number: ");
        int a = sc.nextInt();
        System.out.println("Please Enter your number: ");
        int b = sc.nextInt();
        int lcm = LCM2(a,b);
        System.out.println(lcm);
        sc.close();
    }
    
    public static int LCM2(int a, int b){
    int i = 1;
        while (true) {
            int factor = a*i;
            if (factor%b==0) {
                return factor;
            }
            i++;
        }
    }
}

