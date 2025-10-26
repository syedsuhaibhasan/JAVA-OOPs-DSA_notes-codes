package Recursions;
public class count_zeros {
    public static void main(String[] args) {
        System.out.println(count(2006));
    }
    public static int count(int n){
    return helper(n,0);
    }

    private static int helper(int n, int counter) {
        if (n==0) {
            return counter;
        }
        int rem = n%10;
        if (rem==0) {
           return helper(n/10,counter+1);
        }
        return helper(n/10,counter);
    }
    
}
