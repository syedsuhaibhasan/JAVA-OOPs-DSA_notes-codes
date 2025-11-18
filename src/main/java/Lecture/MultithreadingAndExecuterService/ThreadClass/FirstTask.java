/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lecture.MultithreadingAndExecuterService.ThreadClass;

/**
 *
 * @author humai
 */
public class FirstTask extends Thread{

    @Override
    public void run() {
         //First task
        for (int i  = 0; i <= 1000; i++) {
            System.out.printf("%d* ",i);
        }
       System.out.printf("\n %s task complete ",
                Thread.currentThread().getName());
        
    } 
   
}
