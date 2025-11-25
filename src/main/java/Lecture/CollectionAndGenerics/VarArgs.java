package Lecture.CollectionAndGenerics;
//takes as many as arguements in a method we want
//declared using (...) like in this main method instead of [] we use (...)
public class VarArgs {
    public static void main(String... args) {
        System.out.println("Hello World!");
        System.out.println(sum(5,2,3,3,4,5,84,5));
    }
    
    public static int sum(int... a){
    int sum=0;
    for(int i: a){
    sum+=i;
    }
    return sum;
    }
    
}
