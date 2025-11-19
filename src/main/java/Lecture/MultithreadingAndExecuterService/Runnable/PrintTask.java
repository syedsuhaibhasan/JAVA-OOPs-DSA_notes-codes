package Lecture.MultithreadingAndExecuterService.Runnable;
public class PrintTask implements Runnable{
    @Override
    public void run() {
             //Print task
        for (int i  = 0; i <= 1000; i++) {
            System.out.printf("%d%c* ",i,getChar);
        }
       System.out.printf("\n %s task complete ",
                Thread.currentThread().getName());
         
    }
    
    private final char getChar;

    public PrintTask(char getChar) {
        this.getChar = getChar;
    }  
}
