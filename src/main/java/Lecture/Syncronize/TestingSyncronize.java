/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lecture.Syncronize;

/**
 *
 * @author humai
 */
public class TestingSyncronize {
    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        Counter counter = new Counter();
        UpdateThread t1 = new UpdateThread(counter);
        UpdateThread t2 = new UpdateThread(counter);
        
        t1.start();
        t2.start();
        
        t1.join();
        t2.join();
        long EndTime = System.currentTimeMillis();
        System.out.println("Fincal counter value: "+counter.getCount());
        System.out.println("Total Time Taken: "+(EndTime-startTime));
    }
}
