/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DSA.Queue;

/**
 *
 * @author humai
 */
public class runQueue extends LinearQueue{
    public static void main(String[] args) {
        runQueue obj = new runQueue(5);
        obj.insert(7);
        obj.insert(8);
        obj.insert(9);
        obj.insert(10);
        obj.insert(11);
        obj.print();
    }

    public runQueue(int max) {
        super(max);
    }
}
