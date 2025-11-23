/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lecture.MultithreadingAndExecuterService.Synchronization;


/**
 *
 * @author humai
 */
public class UpdateThread extends Thread{
    private final Counter counter;
    
    public UpdateThread(Counter counter){
    this.counter=counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.incerment();
        }
    }
    
    
}
