package DSA.stacks;
public class polish_notations_inffix_postfix_conversion {
    char infix[];
    char postfix[];
    char stack[];
    int top;
    public polish_notations_inffix_postfix_conversion(int sizeOfArrs){
    infix = new char[sizeOfArrs];
    postfix = new char[sizeOfArrs];
    stack = new char[sizeOfArrs];
    this.top=-1;
    }
    
    public void print(){
        for (int i = 0; i < postfix.length; i++) {
            System.out.println(postfix[i]);
        }
    }
    
    public void push(char item){
        if (top==stack.length-1) {
            System.out.println("Stack overflow");
            return;
        }else{
        stack[++top]=item;
        }
    }
    
    public char pop(){
        if (top==-1) {
            return stack[top]; 
        }else{
        return stack[--top];
        }
    }
    
    public int precedence(char op){
    switch(op){
    case'+':
    case'-':
        return 1;
    case '*':
    case '/':
        return 2;
    case '^':return 3;
    default: return 0;
    }
    }
    
    public void infixToPostfix(String exp){
        for (int i = 0; i < exp.length(); i++) {
            infix[i]=exp.charAt(i);
        }
        char input,next;
        int j =0;
        for (int i = 0; i < exp.length(); i++) {
            input=infix[i];
            switch(input){
                case '(':push(input);
                case ')':
                    while((next = pop())!='('){
                    postfix[j++]=next;
                    }
                    break;
                case '+':
                case '-':    
                case '*':
                case '/':
                case '^':
                    while(!(top==-1)&&precedence(stack[top])>=precedence(input)){
                    postfix[j++]=pop();
                    } 
                    push(input);
                    break;
                default:postfix[j++]=input;
            }
        }
        while(!(top==-1)){
        postfix[j++]=pop();
        }
    }
}
