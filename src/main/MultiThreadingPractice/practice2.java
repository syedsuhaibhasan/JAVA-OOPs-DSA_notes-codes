package MultiThreadingPractice;

public class practice2 extends Thread{
    public static void main(String[] args) throws InterruptedException {
       practice2 obj =new practice2();
        System.out.println(obj.getState());
        obj.start();        
        obj.join();
        System.out.println(obj.getState());
    }

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
            System.out.printf("From the inside run %d ",getState());
        } catch (InterruptedException ex) {
            System.getLogger(practice2.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }
}
