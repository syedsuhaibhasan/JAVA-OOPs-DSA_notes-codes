/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DSA.linkedlist;
import java.util.ArrayList;
/**
 *
 * @author humai
 */
public class Arraylistsexample {
    public static void main(String[] args) {
        //syntax
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(47);
        list.add(57);
        list.add(48);
        list.add(58);  
        list.add(49);
        list.add(59);  
        
        //update index
        list.set(0,77);
        
        //checks if 47 is present or not 
        System.out.println(list.contains(47));
        System.out.println(list);
    }
}
