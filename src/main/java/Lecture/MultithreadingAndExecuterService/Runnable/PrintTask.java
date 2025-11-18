/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lecture.MultithreadingAndExecuterService.Runnable;

/**
 *
 * @author humai
 */
public class PrintTask implements Runnable{

    @Override
    public void run() {
             //Print task
        for (int i  = 0; i <= 1000; i++) {
            System.out.printf("%d%c* ",i,getChar);
        }
       System.out.printf("\n %s task complete ",
                Thread.currentThread().getName());
         
    }
    
    private final char getChar;

    public PrintTask(char getChar) {
        this.getChar = getChar;
    }  
}
