/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lecture.MultithreadingAndExecuterService.ExecuterService;

import java.util.concurrent.Callable;

/**
 *
 * @author humai
 */
public class FetchName implements Callable<String>{
private final String name;

    public FetchName(String name) {
        this.name = name;
    }

    @Override
    public String call() throws Exception {
        System.out.printf("\n Getting from server");
        Thread.sleep(4000);
       return name + "Pakistani";
    }
    
    
}
