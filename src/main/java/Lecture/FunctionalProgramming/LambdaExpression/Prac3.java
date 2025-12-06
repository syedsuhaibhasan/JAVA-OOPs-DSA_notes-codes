package Lecture.FunctionalProgramming.LambdaExpression;

import java.util.List;

public class Prac3 {
    public static void main(String[] args) {
            List<String> conc = List.of("Syed Muhamamd","Suhaib","Hasan");
            String result = conc.stream()
                    .filter(concs -> concs.length()>10)
                    .reduce("",(a, b) -> a+ " " +b);
            
            System.out.println(result);
    }
    
}
 