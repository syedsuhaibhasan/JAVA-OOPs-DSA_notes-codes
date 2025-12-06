/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lecture.FunctionalProgramming;
/*
Create your own functional interface with a single abstract
method that accepts an integer and returns a boolean.
Implement it using a lambda that checks if the number is
prime.
*/
public class Main{
    public static void main(String[] args) {
        Funtionalinterface1 obj = num ->{
            for (int i = 2; i < num/2; i++) {
                if (num%i==0) {
                    return false;
                }
            }
            return true;
        };
        System.out.println(obj.isPrime(5));
    }
}
