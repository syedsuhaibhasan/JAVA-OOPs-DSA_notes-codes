package DSA.Queue;
public class LinearQueue {
    int[] queue;
    int sizeOfqueue;
    int front,rear=-1;
    public LinearQueue(int sizeOfqueue){
    this.queue= new int[sizeOfqueue];
    }
    
    public void enQueue(int item){
        if (rear==queue.length-1) {
            System.out.println("overflow");
            return;
        }else{
            rear++;
            queue[rear]=item;
        }    
    }
    
    public void deQueue(){
        if (front==-1 && rear==-1) {
            System.out.println("empty");
            return;
        }else{
            front++;
        }
    }
    
    void display(){
        if (rear==-1) {
            System.out.println("Queue is empty");
        }else{
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i]+" ");
        }
            System.out.println(" ");
        }
    }
}