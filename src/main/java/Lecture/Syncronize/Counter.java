/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lecture.Syncronize;

/**
 *
 * @author humai
 */
public class Counter {
    private int count=1;
    public synchronized void incerment(){
    count++;
    }
    
    public int getCount(){
    return count;
    }
}
