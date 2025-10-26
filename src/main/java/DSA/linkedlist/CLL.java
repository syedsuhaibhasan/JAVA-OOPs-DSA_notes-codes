package DSA.linkedlist;
public class CLL {
    Node first=null;
    Node last=null;
     class Node{
     int val;
     Node next;
     Node(int val){
     this.val=val;
     this.next=next;
     }
    }
     
    public void insertFirst(int val){
        Node node = new Node(val); 
         if (first==null) {
             first=last=node;
         }
         last.next=node;
         node.next=first;
         last=node;
    }  
    
    public void displayCLL(){
    Node temp=first;
        if (temp!=null) {
            do{
                System.out.print(temp.val+"-->");
                temp=temp.next;
         }while(first!=temp);
     }
        System.out.println("HEAD");
  }
}
