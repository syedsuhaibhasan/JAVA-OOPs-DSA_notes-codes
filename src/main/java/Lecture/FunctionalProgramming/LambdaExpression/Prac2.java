package Lecture.FunctionalProgramming.LambdaExpression;

import java.util.List;

public class Prac2 {
    public static void main(String[] args) {
        List<String> fullName = List.of("Syed","Muhammad","Sohaib","Hasan");
        fullName.stream()
                .forEach(name -> System.out.print(name+" "));
    }
}
