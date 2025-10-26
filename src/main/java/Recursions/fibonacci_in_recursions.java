package Recursions;
public class fibonacci_in_recursions {
    public static void main(String[] args) {
        int count = 5;
        for (int i = 1; i <= count; i++) {
            System.out.print(fibo(i)+" ");
        }
        
    }
    public static int fibo(int position){
        if (position==1) {
            return 0;
        }
        if (position==2) {
            return 1;
        }
    return fibo(position-1)+fibo(position-2);
    }
}
