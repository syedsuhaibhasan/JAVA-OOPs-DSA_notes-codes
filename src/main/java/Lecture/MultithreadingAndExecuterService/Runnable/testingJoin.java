/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lecture.MultithreadingAndExecuterService.Runnable;

/**
 *
 * @author humai
 */
public class testingJoin {
    public static void main(String[] args) throws InterruptedException{
        //instead of created seprate classes we create 
    //3 diff objs of same class working as differend threads
    PrintTask p1 = new PrintTask('/');
    PrintTask p2 = new PrintTask('x');
    PrintTask p3 = new PrintTask('$');
    //making thread obj since we implemented inteface not class
    //create obj and pass runnable
   Thread t1 = new Thread(p1);
   t1.start();
   System.out.println("THREAD 1 STARTED");
   Thread t2 = new Thread(p2);
    System.out.println("THREAD 2 STARTED");
   t2.start();
   //t1.join means when thread 1 and 2 have been fully executed then only thread 3 can be executed
   t1.join();
   Thread t3 = new Thread(p3);   
   System.out.println("Thraed 3 started");
   t3.start();
    }
}
