package Lecture.FunctionalProgramming.LambdaExpression;

import java.util.List;

public class Prac4 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);
        numbers.stream()
                .filter(number -> number%3==0)
                .forEach(number -> System.out.println(number));
    }
    
}
