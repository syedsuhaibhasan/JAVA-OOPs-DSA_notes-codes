/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DSA;

public class Linkedlist {
    int size;
    Linkedlist(){this.size=0;}
    Node head = null;
    Node tail = null;
    class Node{
        //this contructor for middle
    public Node(Node next, int data) {
            this.next = next;
            this.data = data;
    }
    Node next;
    int data;
    //for add first and add last
    Node(int data){
    this.data=data;
    this.next=null;
    }
//END OF NODE CLASS
    }
    public void addFirst(int data){
    Node newNode = new Node(data);
        if (head==null) {
            head=tail=newNode;
        }else{
        newNode.next=head;
        head=newNode;
        }
        size++;
    }
    
    public void addtail(int data){
    Node newNode = new Node(data);
        if (tail==null) {
            head=tail=newNode;
        }else{
        tail.next=newNode;
        tail=newNode;
        }
        size++;
    }
    
    public void insertAt(int val, int index){
    Node temp = head;
        for (int i = 1; i < index; i++) {
            temp=temp.next;
        }
     Node newNode = new Node(temp.next,val); //this newNode points to 3->2->99->1
     temp.next=newNode;     
    }
    
    public void deleteFirst(){
    head=head.next;
    }
    
    public void deleteLast(){
    Node temp = head;
        for (int i = 0; i < size-2 ; i++) {
            temp=temp.next;
        }
        tail=temp;
        tail.next=null;
    }
    
    public void display(){
    System.out.println("");
    Node temp = head;
    while(temp!=null){
        System.out.print(temp.data+"->");
        temp=temp.next;
    }
    }
    
    public void deleteAt(int index){
    Node temp = head;
        for (int i = 1; i < index-1; i++) {
            temp=temp.next;
        }
        temp.next=temp.next.next;
    }
    
    public void count(){
        System.out.println("\n"+size);
    }
    
    public static void main(String[] args) {
        Linkedlist obj = new Linkedlist();
        obj.addFirst(1);
        obj.addFirst(2);
        obj.addFirst(3);
        obj.display();
//        obj.insertAt(99, 2);
        obj.count();
//        obj.display();
//        obj.deleteAt(3);
//        obj.display();
//        obj.deleteFirst();
//        obj.display();
//        obj.deleteLast();
//        obj.display();
        
    }
}
