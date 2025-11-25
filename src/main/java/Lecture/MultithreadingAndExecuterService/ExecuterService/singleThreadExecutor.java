package Lecture.MultithreadingAndExecuterService.ExecuterService;

import Lecture.MultithreadingAndExecuterService.Runnable.PrintTask;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class singleThreadExecutor{
    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();
        PrintTask task1  = new PrintTask('*');
        PrintTask task2  = new PrintTask('@');
        PrintTask task3  = new PrintTask('^');
        //This means there will be only one thread
        //rest of the task will be in queue
        service.submit(task1);
        service.submit(task2);
        service.submit(task3);
        
        service.shutdown();
    }
}
