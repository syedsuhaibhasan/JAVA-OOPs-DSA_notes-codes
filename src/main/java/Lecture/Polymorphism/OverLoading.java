
package Lecture.Polymorphism;
public class OverLoading {
    public int add(int a,int b){
        return a+b;
    }
    //when can also name it different but java helps us and tells
    //whenever the arguement is slightly different it can have same name
    //this means we can use sum(upper one) for two inputs
    //and lower one for inputs with same name 
    public int add(int a,int b,int c,int d){
    return a + b + c + d;
    }
    
    //in this context method will concatinate strings
    public String add(String a, String b){
    return a + b;                  
    }
    
    public static void main(String[] args) {
        OverLoading obj = new OverLoading();
        System.out.println(obj.add(5,4));
        System.out.println(obj.add("Sohaib ", "Hasan"));
        System.out.println(obj.add(1, 2, 3, 4));
        
    }
}
