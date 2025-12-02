
package Lecture.FunctionalProgramming;

import java.util.List;
import java.util.function.Consumer;


public class testingStreamFilter {
    public static void main(String[] args) {
        List<String> fruits = List.of("apple","banana","pomegernate","Grapes","cherry","date");
        //when prrinting normally
        for(String fruit: fruits){
          System.out.print(fruit+" ");
        }
//        System.out.println("\n Printing using streams");//        fruits.stream().forEach(new Consumer<String>(){
//        @Override
//        public void accept(String fruit){
//            System.out.println(fruit);
//        }
//        });
        System.out.println("By using lambda");
        //by using Lambda
        fruits.stream()
                //prints fruits that end with "A" 
                .filter(fruit -> fruit.endsWith("e"))
                //for Each is terminal method
//                .forEach(fruit -> System.out.println(fruit));
                //using method references
                .forEach(System.out::println);
    }
    
}
