package Lecture.MultithreadingAndExecuterService.ExecuterService;

import Lecture.MultithreadingAndExecuterService.Runnable.PrintTask;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MultithreadingUsingExecuterService {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(2);
        PrintTask task1  = new PrintTask('*');
        PrintTask task2  = new PrintTask('@');
        PrintTask task3  = new PrintTask('^');
        //This means there will be 3 threads created
        service.submit(task1);
        service.submit(task2);
        service.submit(task3);
        
        service.shutdown();
        if (!(service.awaitTermination(10, TimeUnit.SECONDS))) {
            //waits for 10 seconds and then immediatly kill all threads
            //even if task is not completed
            service.shutdownNow(); 
        }
    }
} 
