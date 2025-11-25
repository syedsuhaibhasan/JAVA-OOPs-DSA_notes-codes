package Recursions;
public class product_of_digits {
    public static void main(String[] args) {
        long ans = pod(233);
        System.out.println(ans);
    }
    public static long pod(int n){
    if (n%10==n) {
        return(long) n;
    }
    return (n%10)*pod(n/10);
    }
}
