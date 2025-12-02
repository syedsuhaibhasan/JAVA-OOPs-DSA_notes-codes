package Lecture.FunctionalProgramming.LambdaExpression;
public class TestingLambda {
      public static void main(String[] args) {
          TestingLambda obj = new TestingLambda();
          int sum = obj.sum(1,2);
          obj.printString("This is the best course");
          
//          toPrint -> System.out.println(toPrint);
//        (a,b) -> a+b;
//        (a,b) -> {
//            int sum = a+b; 
//            System.out.println(sum);
//        }
      }
      
       public int sum(int a, int b){
            int sum = a + b;
            return sum;
        }
       
       public void printString(String toPrint){
           System.out.println(toPrint);
       }
}
