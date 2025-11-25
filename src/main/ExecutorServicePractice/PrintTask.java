/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExecutorServicePractice;

/**
 *
 * @author humai
 */
public class PrintTask implements Runnable{
    //for prac1
//    @Override
//    public void run() {
//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//        }
//        System.out.println("Task completed by "+
//                Thread.currentThread().getName());
//    }
    
    //for prac2
    
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            System.getLogger(PrintTask.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println("Task completed by "+
                Thread.currentThread().getName());
    }
}
