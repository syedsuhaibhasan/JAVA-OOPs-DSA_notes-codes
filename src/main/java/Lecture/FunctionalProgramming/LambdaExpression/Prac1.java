package Lecture.FunctionalProgramming.LambdaExpression;

import java.util.function.BinaryOperator;

public class Prac1 {
    public static void main(String[] args) {
        Prac1 obj = new Prac1();
        BinaryOperator<Integer> multi = (a, b) -> a * b;
        int result  = multi.apply(4, 5);
        System.out.println(result);
    }
}
