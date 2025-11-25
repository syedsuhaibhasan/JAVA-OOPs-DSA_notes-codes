package Lecture.MultithreadingAndExecuterService.Runnable;
public class testingPriority{
    public static void main(String[] args) {
     PrintTask p1 = new PrintTask('*');
     PrintTask p2 = new PrintTask('#');
     PrintTask p3 = new PrintTask('+');
     
     Thread t1 = new Thread(p1);
     t1.setPriority(Thread.MAX_PRIORITY);
     t1.start();
     Thread t2 = new Thread(p2);
     t2.setPriority(Thread.MIN_PRIORITY);
     t2.start();
     Thread t3 = new Thread(p3);
     t3.setPriority(9);
     t3.start();
     
     t1.setName("Thread A");
     t2.setName("Thread B");
     t3.setName("Thread C");
    }
}
