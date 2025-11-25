package Recursions;
public class basicrec {
    public void printnumbers(int n){
        System.out.println(n);
        if (n==0) {
            return;
        }
        printnumbers(n-1);
    }
    
    public static void main(String[] args) {
        basicrec obj = new basicrec();
        obj.printnumbers(5);
    }
}
