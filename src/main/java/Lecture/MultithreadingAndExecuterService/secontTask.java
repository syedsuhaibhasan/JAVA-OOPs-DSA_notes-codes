/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lecture.MultithreadingAndExecuterService;

/**
 *
 * @author humai
 */
public class secontTask extends Thread{
    
    @Override
    public void run(){
    
        for (int i  = 0; i <= 1000; i++) {
            System.out.printf("%d^ ",i);
        }
        System.out.printf("\n %s task complete ",
                Thread.currentThread().getName());
    }
}
