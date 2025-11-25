/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DSA.linkedlist;

/**
 *
 * @author humai
 */
public class doublyLL {  
    int size;
    private Node first = null;
    private Node last = null;
    public doublyLL() {
        this.size = 0;
    }
    class Node{
    int val;
    Node next;
    Node prev;
        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
        
        public Node(int val) {
            this.val = val;
            this.next=null;
            this.prev=null;
        }
   }
    public void addFirst(int val){
        Node newNode = new Node(val);
        newNode.next=first;
        newNode.prev=null;
        if (first!=null) {
             first.prev=newNode;
        }
        first=newNode;
        size++;
    }
    
    public void displayForward(){
    Node temp = first;
    while(temp!=null){
        System.out.print(temp.val+"-->");
        temp=temp.next;
        }
        System.out.print("NULL\n");
    }
    public void displayBackward(){
    Node temp = first;
    Node current = null;
    while(temp!=null){
        current=temp;
        temp=temp.next;
        }
    while(current!=null){
        System.out.print(current.val+"-->");
        current=current.prev;
    }
        System.out.print("NULL");
    }
}