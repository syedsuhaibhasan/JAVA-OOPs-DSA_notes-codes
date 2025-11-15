package Lecture.PassByArguementAndPassByValue;
public class PassBy {
    public static void main(String[] args) {
        int x=10;
        int y = 15;
        int sum = add(x,y);
        System.out.printf("x=%d, y=%d, sum=%d", x ,y ,sum);
    }
    
    public static int add(int a, int b){
     a +=b;
    return a;
    }
}
