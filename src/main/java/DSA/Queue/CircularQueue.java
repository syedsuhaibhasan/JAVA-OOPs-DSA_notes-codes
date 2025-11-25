package DSA.Queue;
public class CircularQueue {
    int[] queue;
    int sizeOfqueue;
    int max;
    int front,rear=-1;
    
    public CircularQueue(int sizeOfqueue){
    this.queue=new int[sizeOfqueue];
    this.max=sizeOfqueue;
    }
    
    public void enQueue(){}
}
