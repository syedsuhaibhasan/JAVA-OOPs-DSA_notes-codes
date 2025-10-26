package DSA.linkedlist;
public class LL {
    private Node first=null;
    private Node last=null;
    int size;
    public LL() {
        this.size=0;
    }
    
    //NESTED CLASS NOT INHERITIED OR EXTENDED CLASS
    class Node{
    int val;
    Node next;
    public Node(int val, Node next){
        this.val = val;
        this.next = next;
        }
    public Node(int val){
        this.val=val;
        this.next=null;
        }
    }//END OF NODE CLASS
    
    public void addfirst(int val){
    Node newNode = new Node(val);
     if (first==null) {
            first=last=newNode;
        }
     else{newNode.next=first;
       first=newNode;
        }
     size+=1;
    }
    public void displaylist(){
    Node temp = first;
    while(temp!=null){
        System.out.print(temp.val+"-->");
        temp=temp.next;
        }
        System.out.println("null");
    }
    
    public void addLast(int val){
    Node newNode = new Node(val);
    if (last==null) {
            first=last=newNode;
        }
    else{
        last.next=newNode;
        last=newNode;
        }
    size+=1;
    }
    
    public void insertAt(int val, int index){
        if (index==0) {
            addfirst(val);
            return;
        }
        if (index==size) {
            addLast(val);
            return;
        }
       
        Node temp = first;
        for (int i = 1; i < index; i++) {
            temp=temp.next;
        }
        Node newNode = new Node(val,temp.next);
        temp.next=newNode;
    }
    
    public void deleteFirst(){
    first=first.next;   
    }
    
    public Node get(int index){
        Node node=first;
        for (int i = 0; i < index; i++) {
            node=node.next;
        }
        return node;
    }
        
    public void deleteLast(){
        Node temp = first;
        if (size<=1) {
          deleteFirst();
          return;
        }
//        Node secondlast=get(size-2);
//        int val = last.val;
//        last=secondlast;
//        last.next=null;
        for (int i = 1; i < size-1; i++) {
            temp=temp.next;
        }
        last=temp;
        temp.next=null;
    }
    
    public void deleteAt(int index){
       if (index==0) {
            deleteFirst();
            return;
        }
        if (index==size) {
            deleteLast();
            return;
        }
//        Node temp = first;
//        for (int i = 1; i < index-1; i++) {
//            temp=temp.next;
//        }
//        temp.next=temp.next.next;
       
        Node prev = get(index-1);
        int val = prev.next.val;
        prev.next=prev.next.next;
    }

    public Node find(int val){
    Node node = first;
    while(node!=null){
        if (node.val==val) {
            return node;
        }
        node.next=node;
    }
        return null;
    }
}
