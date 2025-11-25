package DSA;      
class practice1{
    int size;
    practice1(){this.size=0;}
    
    Node head=null;
    class Node{
    int val;
    Node next;
    Node(int val){
    this.val=val;
    this.next=null;
    }
    }//END OF NODE CLASS
    
    class Stacks{
    int stackArr[];
    int top;
    Stacks(int length){
    this.stackArr=new int[length];
    this.top=-1;
    }
    
    public boolean isFull(){
    return (top==stackArr.length);
    }
    
    public boolean isEmpty(){
    return (top==-1);
    }
    
    public void push(int val){
    ++top;
        if (isFull()) {
            System.out.println("Stack overflow");
            top--;
        }else{
        stackArr[top]=val;
        }
    }
    
    public int pop(){
        return stackArr[top--];
    }
    }//END OF STACKS CLASS
    
    
    public void addFirst(int val){
    Node newNode = new Node(val);
        if (head==null) {
            head=newNode;
        }
        else{
        newNode.next=head;
        head=newNode;
        }
        size++;
    }
    
    public void Display(){
    Node temp = head;
    while(temp!=null){
        System.out.println(temp.val+"-->");
        temp=temp.next;
    }
        System.out.println("NULL");
    }
    
    public boolean isPalindrome(practice1 list){
    Stacks stack = new Stacks(list.size);
    Node temp = list.head;
    while(temp!=null){
    stack.push(temp.val);
    temp=temp.next;
    }
    temp=list.head;
    while(temp!=null){
    int data = stack.pop();
        if (data!=temp.val) return false;
        temp=temp.next;
      }
    return true; 
    }
      
    public static void main(String[] args) {
        practice1 obj = new practice1();
        obj.addFirst(1);
        obj.addFirst(0);
        obj.addFirst(1);
        System.out.println(obj.isPalindrome(obj));
    }
}

