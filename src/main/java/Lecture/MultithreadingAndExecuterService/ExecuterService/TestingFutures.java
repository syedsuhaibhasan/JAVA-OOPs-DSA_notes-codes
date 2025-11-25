/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lecture.MultithreadingAndExecuterService.ExecuterService;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 *
 * @author humai
 */
public class TestingFutures {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService service = Executors.newFixedThreadPool(2);
        FetchName task1 = new FetchName("Syed");
        FetchName task2 = new FetchName("Muhammad");
        FetchName task3 = new FetchName("Sohaib");
        FetchName task4 = new FetchName("Hasan");
        
        Future<String> name1 = service.submit(task1);
        Future<String> name2 = service.submit(task2);
        Future<String> name3 = service.submit(task3);
        Future<String> name4 = service.submit(task4);
        
        System.out.println("\n"+name1.get());
        System.out.println("\n"+name2.get());
        System.out.println("\n"+name3.get());
        System.out.println("\n"+name4.get());
        
        service.shutdown();
    }
}
