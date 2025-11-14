package DSA;
public class practiceDLL {
    Node head=null;
    Node tail=null;
    class Node{
    Node next;
    Node prev;
    int val;
    Node(int val){
    this.val=val;
    this.next=null;
    this.prev=null;
    }
    
    Node(int val, Node next){
    this.val=val;
    this.next=next;
    this.prev=null;
    }
    }//END OF NODE CLASS
    
    public void addFirst(int val){
        Node node = new Node(val);
        node.next=head;
        node.prev=null;
        if (head!=null) {
           head.prev=node;
        }
        head=node;
        if (tail == null) {
            tail = node;
        }
    }
    
    public void addLast(int val){
        Node node = new Node(val);
        if (head == null) { 
            head = node;
            tail = node;
        } else {
        tail.next=node;
        node.prev=tail;
        tail=node;
        }
    }
    
    public Node getNode(int index){
        Node temp=head;
        for (int i = 0; i < index; i++) {
            temp=temp.next;
        }
        return temp;
    }
    
    public void insertAt(int index, int val){
    Node temp = getNode(index-1);
    Node node = new Node(val,temp.next);
    temp.next=node;
    node.prev=temp;
    }
    
    public void deleteAt(int index){
    Node prev = getNode(index-1);
    int val = prev.next.val;
    prev.next=prev.next.next;
    }
    
    public void displayForward(){
    Node temp = head;
        System.out.print("\nNULL<->");
    while(temp!=null){
        System.out.print(temp.val+"<->");
        temp=temp.next;
    }
    System.out.println("NULL");
    }
    
    public static void main(String[] args) {
        practiceDLL obj = new practiceDLL();
        obj.addFirst(1);
        obj.addFirst(2);
        obj.addFirst(3);
        obj.displayForward();
        obj.addLast(99);
        obj.displayForward();
        obj.insertAt(2, 77);
        obj.displayForward();
        obj.deleteAt(2);
        obj.displayForward();
        
    }
}
