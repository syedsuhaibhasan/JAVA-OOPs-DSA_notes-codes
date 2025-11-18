package Lecture.MultithreadingAndExecuterService.ThreadClass;
public class Main {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        //To implement multithreading first create objects of those classes in whcih
        //the task in distributed
        FirstTask t1 = new FirstTask();
        secontTask t2 = new secontTask();
        thirdTask t3 = new thirdTask();
        //using .start() to create threads
        System.out.println("Starting first thread \n");
        t1.start();
        System.out.println("Starting second thread \n");
        t2.start();
        System.out.println("Starting Third thread \n");
        t3.start();
        
        //in output it is expected that you'll get total chaos output
        //thats fine because now every task is done simultaneously so output is mixed with
        //^*@ like 1^ 2^ 1@ 2@ 3^ 1* 2*
        //the println is doing its work properly but due to many calls at the same time
        //the output is messy and that fine :)
        
        long endTime = System.currentTimeMillis();
        System.out.printf("%s Total time: %d",
                Thread.currentThread().getName(),
                (endTime-startTime));
    }
}
