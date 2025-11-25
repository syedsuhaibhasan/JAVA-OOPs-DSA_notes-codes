/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExecutorServicePractice;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author humai
 */
public class prac3 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
    ExecutorService service = Executors.newFixedThreadPool(3);
    factorial obj1 = new factorial(5);
    factorial obj2 = new factorial(6);
    factorial obj3 = new factorial(7);
    factorial obj4 = new factorial(4);
    factorial obj5 = new factorial(3);
    
    Future<Integer> f1 = service.submit(obj1);
    Future<Integer> f2 = service.submit(obj2);
    Future<Integer> f3 = service.submit(obj3);
     Future<Integer> f4 = service.submit(obj4);
      Future<Integer> f5 = service.submit(obj5);
    
        System.out.println("factorial of 5 is"+f1.get());
        System.out.println("factorial of 6 is"+f2.get());
        System.out.println("factorial of 7 is"+f3.get());
        System.out.println("factorial of 4 is"+f4.get());
        System.out.println("factorial of 3 is"+f5.get());
    
    service.shutdown();
        if (!(service.awaitTermination(10, TimeUnit.MILLISECONDS))) {
            System.out.println("Shutting down immediatly");
            service.shutdownNow();
        }
    }
}
