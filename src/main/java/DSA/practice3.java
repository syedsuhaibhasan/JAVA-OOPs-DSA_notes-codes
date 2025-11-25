package DSA;
public class practice3 {
    int[] stackArr;
    Node top=null;
    class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
        this.next=null;
    }
    }//END OF NODE CLASS
    
    
    public boolean isEmpty(){
    return (top==null);
    }
    
    public void push(int val){
    Node node = new Node(val);
        if (top==null) {
            top=node;
        }else{
        node.next=top;
        top=node;
        }
    }
    
    public void pop(){
        if (isEmpty()) {
            System.out.println("Stack underflow");
        }
        else{
            System.out.println(top.val);
            top=top.next;
        }
    }
    
    public void display(){
    Node temp = top;
    while(temp!=null){
        System.out.println(temp.val);
        temp=temp.next;
    }
    }
    
    public static void main(String[] args) {
        practice3 stack = new practice3();
        int num = 11;
        while(num>0){
        int remainder = num%2;
        stack.push(remainder);
        num=num/2;
        }
        
        while(!stack.isEmpty()){
           stack.pop();
        }
    }
}
