/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DSA.Queue;

/**
 *
 * @author humai
 */
public class CircularQueue {
    int[] queue;
    int sizeOfqueue;
    int max;
    int front,rear=-1;
    
    public CircularQueue(int sizeOfqueue){
    this.queue=new int[sizeOfqueue];
    this.max=sizeOfqueue;
    }
    
    public void enQueue(){}
}
