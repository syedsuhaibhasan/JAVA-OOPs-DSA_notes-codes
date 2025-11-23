/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DSA.Queue;

/**
 *
 * @author humai
 */
public class runQueue {
    public static void main(String[] args) {
        LinearQueue obj = new LinearQueue(3);
        obj.enQueue(1);
        obj.enQueue(2);
        obj.enQueue(3);
        obj.display();
        obj.deQueue();
        obj.display();
        obj.deQueue();
        obj.display();
    }
}
