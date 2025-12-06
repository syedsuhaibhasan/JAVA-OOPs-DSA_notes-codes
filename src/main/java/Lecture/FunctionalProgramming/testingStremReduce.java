/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lecture.FunctionalProgramming;

import java.util.List;

/**
 *
 * @author humai
 */
public class testingStremReduce {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5);
        
        int sum = 0;
        for(Integer number: numbers){
            sum+=number;
        }
        //finding sum using stream
        int newSum =  numbers.stream()
                .reduce(0,(a, b) -> a+b );
        System.out.println("Sum using reduce"+newSum);
    }
}
