/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lecture.FunctionalProgramming;

import java.util.function.BinaryOperator;
import java.util.stream.IntStream;

/*
Write two versions of a program that calculates the factorial
of a number: one using structural (procedural) programming,
and the other using functional programming.
 */
public class Prac2 {
    public static int factorial(int num){
        if (num==1) {
            return 1;
        }
        else{
        int factorial=1;
        for (int i = 2; i <= num; i++) {
            factorial*=i;
        }
        return factorial;
        }
    }
    public static void main(String[] args) {
        System.out.println("Answer from simple function");
        int ans = factorial(5);
        System.out.println(ans);
        
        System.out.println("Answer From lambda");
        IntStream.rangeClosed(2, 5)
                .reduce((a, b) -> a*b)
                .ifPresent(System.out::println);
    }
}
