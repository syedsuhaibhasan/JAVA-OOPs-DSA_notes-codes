package MultiThreadingPractice;
public class practice1 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.printf("\n Hello from %s", Thread.currentThread().getName());
        }
        System.out.printf("Task completed %s",Thread.currentThread().getName());
    }
    
    public static void main(String[] args) {
        practice1 t1 = new practice1();
        practice1 t2 = new practice1();
        
        t1.start();
        t2.start();
    }
}
