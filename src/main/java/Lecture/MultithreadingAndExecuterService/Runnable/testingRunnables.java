package Lecture.MultithreadingAndExecuterService.Runnable;
public class testingRunnables{
    public static void main(String[] args) {
        //instead of created seprate classes we create 
    //3 diff objs of same class working as differend threads
    PrintTask p1 = new PrintTask('/');
    PrintTask p2 = new PrintTask('x');
    PrintTask p3 = new PrintTask('$');
    //making thread obj since we implemented inteface not class
    //create obj and pass runnable
   Thread t1 = new Thread(p1);
   t1.start();
   Thread t2 = new Thread(p2);
   t2.start();
   Thread t3 = new Thread(p3);   
   t3.start();
    }
}
