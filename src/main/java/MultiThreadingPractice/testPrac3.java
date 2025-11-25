/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MultiThreadingPractice;

import MultiThreadingPractice.practice3;

/**
 *
 * @author humai
 */
public class testPrac3 {
    public static void main(String[] args) throws InterruptedException {
        practice3 obj = new practice3('$');
        practice3 obj1 = new practice3('#');
        practice3 obj2 = new practice3('&');
        
        obj.setName("A");
        obj1.setName("B");
        obj2.setName("C");
        
        obj.start();
        obj.join();
        obj1.start();
        obj1.join();
        obj2.start();
        
    }
}
