package Recursions;
public class palindrome_for_check {
    public static void main(String[] args) {
        System.out.println(palindrome_check(2312));
        
    }
    
    static int sum=0;
    public static int reverse(int n){
        if (n==0) {
            return 0;
        }
    int rem = n%10;
    sum = sum*10+rem;
    reverse(n/10);
    return sum;
    }
    
    public static boolean palindrome_check(int n){
        return n == reverse(n);
    }
}
