/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lecture.MultithreadingAndExecuterService;

/**
 *
 * @author humai
 */
public class testClass {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        //First task
        for (int i  = 0; i <= 1000; i++) {
            System.out.printf("%d* ",i);
        }
        System.out.println("\n First task completed");
        
        for (int i  = 0; i <= 1000; i++) {
            System.out.printf("%d^ ",i);
        }
        System.out.println("\n Second task completed");
        
        for (int i  = 0; i <= 1000; i++) {
            System.out.printf("%d@ ",i);
        }
        System.out.println("\n Third task completed");
        
        for (int i  = 0; i <= 1000; i++) {
            System.out.printf("%d$ ",i);
        }
        System.out.println("\n Fourth task completed");
        
        long endTime = System.currentTimeMillis();
        
        System.out.println("Start Time: "+startTime);
        System.out.println("End Time: "+endTime);
        long totalTime = endTime-startTime;
        System.out.println("Total Time: "+totalTime);
    }
}
