/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExecutorServicePractice;

//used by prac3

import java.util.concurrent.Callable;

public class factorial implements Callable<Integer>{
    private final int num;
    public factorial( int num ) {
        this.num = num;
    }

    @Override
    public Integer call() throws Exception {
        Thread.sleep(10000);
        if (num<1) {
            return 1;
        }
        int factorial=1;
        for (int i = 2; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }
    
}
