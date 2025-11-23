package MultiThreadingPractice;
public class PrintHelloWorld extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.printf("\n Hello from %s", Thread.currentThread().getName());
        }
        System.out.printf("Task completed %s",Thread.currentThread().getName());
    }
    
    public static void main(String[] args) {
        PrintHelloWorld t1 = new PrintHelloWorld();
        PrintHelloWorld t2 = new PrintHelloWorld();
        
        t1.start();
        t2.start();
    }
}
