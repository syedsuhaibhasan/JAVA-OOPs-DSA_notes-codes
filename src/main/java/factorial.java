
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author humai
 */
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        if(num==1){
            System.out.println("the answer is 1");}
        else{
            int factorial = 1;
        for (int i = num; i >= 1; i--) {
             factorial *= (i);
             System.out.println(factorial);}
        }  
        }
}

