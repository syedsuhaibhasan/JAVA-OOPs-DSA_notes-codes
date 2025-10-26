package Recursions;
public class sum_of_digits {
    public static void main(String[] args) {
        int ans = sod(1024);
        System.out.println(ans);
    }
    public static int sod(int n){
        if (n==0) {
            return 0;
        }
        return (sod(n%10)*10)+sod(n/10);
    }
}
