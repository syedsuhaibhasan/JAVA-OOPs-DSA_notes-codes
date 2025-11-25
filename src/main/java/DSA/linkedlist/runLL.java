/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DSA.linkedlist;
//THIS CLASS RUNS ALL METHODS PRESCRIBED IN LL.java AND doublyLL.java 
/**
 *
 * @author humai
 */
public class runLL {
    public static void main(String[] args) {
        //SINGLY LL OPERATIONS
        
//        LL list = new LL();
//        list.addfirst(4);
//        list.addfirst(5);
//        list.addfirst(6);
//        list.addfirst(7);
//        list.addfirst(8);
//        list.addfirst(9);
//        //when displayed the last element added becames first because head is changed
//        list.addLast(10);
//        list.displaylist();
//        list.insertAt(99, 3);
//        list.displaylist();
//        list.deleteFirst();
//        list.displaylist();
//        list.deleteLast();
//        list.displaylist();
//        list.deleteAt(3);
//        list.displaylist();
//        list.find(5);
     
        //END OF SINGLY LL OPERATIONS
        
        //DOUBLY LL OPERATIONS
        
//        doublyLL list = new doublyLL();
//        list.addFirst(1);
//        list.addFirst(2);
//        list.addFirst(3);
//        list.addFirst(4);
//        list.addFirst(5);
//        list.addFirst(6);
//        list.displayForward();
//        list.displayBackward();

        //CIRCULAR LL OPERATION
        
        CLL list = new CLL();
        list.insertFirst(6);
        list.insertFirst(5);
        list.insertFirst(4);
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(1);
        list.displayCLL();
    }
}
