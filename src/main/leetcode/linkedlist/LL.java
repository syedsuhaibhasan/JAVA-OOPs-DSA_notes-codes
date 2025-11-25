package leetcode.linkedlist;
public class LL {
    private Node first=null;
    private Node last=null;
    class Node{
    Node next;
    int val;
    //1. construcotr
      public Node(Node next, int val) {
       this.next = next;
       this.val = val;
      }
    //2. constructor 
      Node(int val){
       this.val=val;
       this.next=null;
      } 
    }//END OF NODE CLASS
    
    public void addLast(int val){
    Node node = new Node(val);
        if (last==null) {
            first=last=node;
        }else{
        last.next=node;
        last=node;
        }
    }
    
    public void addFirst(int val){
    Node node = new Node(val);
        if (first==null) {
            first=last=node;
        }
        else{
        node.next=first;
        first=node;
        }
    }
    
    public void displayList(){
    Node temp = first;
    while(temp!=null){
        System.out.print(temp.val+" -> ");
        temp=temp.next;
     }
        System.out.println("NULL");
    }
    
    //Adding with recursions
    public void insertAt(int val, int index){
        first = insertAt(val,index,first);
    }
    //helper function
    private Node insertAt(int val, int index, Node node){
        if (index==0) {
            Node temp = new Node(node,val);
            return temp;
        }
        node.next=insertAt(val,index-1,node.next);
        return node;
    }
    
    //Remove Duplicate
    public Node DeleteDuplicate(Node temp){
    if(temp==null){return temp;}
    Node first = temp;
    while(temp.next!=null){
        if (temp.val==temp.next.val) {
            temp.next=temp.next.next;
        }
        else{
        temp=temp.next;
        }
    }
    return temp;
    }
    
    //Merge two sorted lists
    public static LL mergeLists(LL list1, LL list2){
    Node temp1 = list1.first;
    Node temp2 = list2.first;
    LL newNode = new LL();
    while(temp1!=null && temp2!=null){
        if (temp1.val<temp2.val) {
            newNode.addLast(temp1.val);
            temp1=temp1.next;
        }else{
            newNode.addLast(temp2.val);
            temp2=temp2.next;
        }
    }    
    
    while(temp1!=null){
    newNode.addLast(temp1.val);
    temp1=temp1.next;
    }
    
    while(temp2!=null){
    newNode.addLast(temp2.val);
    temp2=temp2.next;
    }
    
    return newNode;
    } 
    
    //Middle Element
    public Node middleNode(){
    Node slow = first;
    Node fast = first;
    while(fast!=null && fast.next!=null){
    slow=slow.next;
    fast=fast.next.next;
    }
    return slow;
    }
    
    //Reverse LinkedList (Recursively)
    public void reverseList(Node node){
        if (node==last) {
            first=last;
            return;
        }
        reverseList(node.next);
        last.next=node;
        last=node;
        last.next=null;
    }
    
    //Reverse LinkedList (3 pointer solution)
    public Node reverseList1(Node node){
        if (first==null) {
            return first;
        }
    Node previous = null;
    Node present = first;
    Node next = null;
    while(present!=null){
    present.next=next;
    present.next=previous;
    previous=present;
    present= next;
        if (next!=null) {
            next=next.next;
        }
    }
    first=previous;
    return previous;
    }
    
    //Palindrome
    public boolean isPalindrome(){
    Node mid = middleNode();
    Node secondHead = reverseList1(mid);
    Node reverseHead = secondHead;
    while(first!=null&&secondHead!=null){
        if (first.val!=secondHead.val) {
            break;
        }
    first=first.next;
    secondHead=secondHead.next;
    }
    reverseList1(reverseHead);
    return (first==null || secondHead==null);
    }
    
    
    //Main class
    public static void main(String[] args) {
//        LL obj = new LL();
        LL obj2 = new LL();
        //first list
//        obj.addFirst(20);
//        obj.addFirst(10);
//        obj.addFirst(9);
//        obj.addFirst(7);
//        obj.addFirst(6);
//        obj.addFirst(4);
//        obj.addFirst(2);
//        obj.addFirst(1);
//        obj.displayList();
        //Second list
        obj2.addFirst(8);
        obj2.addFirst(6);
        obj2.addFirst(5);
        obj2.addFirst(3);
        obj2.addFirst(1);
        obj2.displayList();
//        obj2.middleNode();
//        obj2.reverseList1();
        obj2.displayList();
//        obj.insertAt(99, 4);
//        obj.DeleteDuplicate();
//        obj.displayList();
//        LL ans = LL.mergeLists(obj, obj2);
//        ans.displayList();
    }
    
}
