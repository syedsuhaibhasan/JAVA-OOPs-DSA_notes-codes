package MultiThreadingPractice;
public class practice3 extends Thread{

    @Override
    public void run() {
        System.out.printf("Thread %s started \n",Thread.currentThread().getName());
        for (int i = 1; i < 10; i++) {
            System.out.printf("%d%c ",i,getChar);
        }
        System.out.printf("%s task completed",Thread.currentThread().getName());
    }
    
    private char getChar;

    public practice3(char getChar) {
        this.getChar = getChar;
    }
    
}
