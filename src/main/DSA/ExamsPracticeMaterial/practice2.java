package DSA;
public class practice2 {
    char[] stackArr;
    int top;
    char vowels;
    practice2(int size){
    this.stackArr=new char[size];
    this.top=-1;
    }
    
    public boolean isFull(){
    return (top==stackArr.length);
    }
    
    public boolean isEmpty(){
    return (top==-1);
    }
    
    public void push(char vowels){
    ++top;
        if (isFull()) {
            System.out.println("Stack overflow");
            top--;
        }
        stackArr[top]=vowels;
    }
    
    public int pop(){
        if (isEmpty()) {
            System.out.println("Stack underflow");
        }
        return stackArr[top--];
    }
    
    public void display(){
    int i = top;
    while(i>=0){
        System.out.println(stackArr[i]);
        i--;
    }
    }
    
    public static void main(String[] args) {
        practice2 obj1 = new practice2(5);
        practice2 obj2 = new practice2(5);
        practice2 obj3 = new practice2(5);
        String input= "aeiou";
        System.out.println("Pushing in stack 1");
        for (int i = 0; i < input.length(); i++) {
            obj1.push(input.charAt(i));
        }
        obj1.display();

        while(!obj1.isEmpty()){
        obj2.push((char) obj1.pop());
        }
        while(!obj2.isEmpty()) {
            obj3.push((char) obj2.pop());
        }
        System.out.println("Popping from stack 3 and pushing in stack 1 for final answer");
        while(!obj3.isEmpty()) {
            obj1.push((char) obj3.pop());
        }
        obj1.display();
    }
}
