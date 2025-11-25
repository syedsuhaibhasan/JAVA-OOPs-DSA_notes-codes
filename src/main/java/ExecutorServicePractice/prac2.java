/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExecutorServicePractice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author humai
 */
public class prac2 {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(3);
        PrintTask obj1 = new PrintTask();
        PrintTask obj2 = new PrintTask();
        PrintTask obj3 = new PrintTask();
        PrintTask obj4 = new PrintTask();
        
        service.submit(obj1);
        service.submit(obj2);
        service.submit(obj3);
        service.submit(obj4);
        
        service.shutdown();
    }
}
