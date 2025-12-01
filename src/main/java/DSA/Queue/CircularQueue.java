package DSA.Queue;
public class CircularQueue {
    int[] queue;
    int sizeOfqueue;
    int max;
    int front,rear;
    
    public CircularQueue(int sizeOfqueue){
    this.queue=new int[sizeOfqueue];
    this.max=sizeOfqueue;
    this.rear=-1;
    this.front=-1;
    }
    
    public void enQueue(int item){
        if ((rear+1)%max==front) {
            System.out.println("OVERFLOW");
            return;
        }if (front==-1 && rear== -1) {
            front=rear=0;
        }else{
            rear=(rear+1)%max;
        }
        queue[rear]=item;
    }
    
    public void deQueue(){
        if (front==-1) {
            System.out.println("UNDERFLOW");
            return;
        }if (front==rear) {
            front=rear=-1;
        }else{
            front=front+1;
        }
    }
    
    public void display(){
        if (front==-1) {
            System.out.println("Empty list");
            return;
        }
        int i=front;
        while(true){
             System.out.print(queue[i] + " ");

            if (i == rear) break;

            i = (i + 1) % max;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        CircularQueue obj = new CircularQueue(3);
        obj.enQueue(1);
        obj.enQueue(2);
        obj.enQueue(3);
        obj.display();
        obj.deQueue();
        obj.enQueue(99);
    }
}
