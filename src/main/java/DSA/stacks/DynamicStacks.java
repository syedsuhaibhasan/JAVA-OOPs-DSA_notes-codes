package DSA.stacks;
public class DynamicStacks {
    Node top = null;
    
    class Node{
    Node next;
    int item;
    Node(int item){
    this.item=item;
    this.next=null;
    }
    }//Node Class ends here
    
    public void push(int item){
    Node node = new Node(item);
        if (top==null) {
            top=node;
        }
        else{
        node.next=top;
        top=node;
        }
    }
    
    public void pop(){
        if (top==null) {
            System.out.println("Stack underFlow");
        }else{
        System.out.println("Element popped: "+top.item);
        top=top.next;
        }
    }
    
    public void displayStack(){
    Node temp = top;
    while(temp!=null){
        System.out.println(temp.item);
        temp=temp.next;
    }
    }
    
    public static void main(String[] args) {
    DynamicStacks obj = new DynamicStacks();
    
    obj.push(1);
    obj.push(2);
    obj.push(3);
    obj.pop();
    obj.pop();
    obj.pop();
    obj.pop();
    obj.pop();
    obj.pop();
    obj.pop();
    obj.push(99);
    obj.push(1);
    obj.push(2);
    obj.push(3);
    obj.push(4);
    obj.displayStack();
    }
}
