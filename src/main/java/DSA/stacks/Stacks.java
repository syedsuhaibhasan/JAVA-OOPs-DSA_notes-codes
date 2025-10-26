package DSA.stacks;
public class Stacks {
    int stackArr[];
    int top;
    //constructor
    public Stacks(int size){
    this.stackArr=new int[size];
    this.top=-1;
    }
    
    public boolean isFull(){
    return (top==stackArr.length);
    }
    
    public boolean isEmpty(){
    return (top==-1);
    }
    
    public void push(int item){
        ++top;
        if (isFull()) {
            System.out.println("Stack overflow");
            top--;
            return;
        }else{
            stackArr[top]=item;
        }
    }
    
    public void pop(){
        if (isEmpty()) {
            System.out.println("Stack underflow");
            return;
        }else
        System.out.println("Element removed:"+stackArr[top--]);
    }
    
    public void display(){
    int i = top;
    while(i>=0){
        System.out.println(stackArr[i]);
        i--;
       }
    }
    
    public static void main(String[] args) {
    Stacks obj = new Stacks(5);
    obj.push(88);
    obj.push(99);
    obj.push(1);
    obj.push(2);
    obj.push(3);
    obj.push(4);
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
    obj.display();
    }
}
