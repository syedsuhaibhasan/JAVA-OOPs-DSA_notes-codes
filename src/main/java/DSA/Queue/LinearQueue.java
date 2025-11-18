package DSA.Queue;
public abstract class LinearQueue {
   private int front=-1;
   private int rear=-1;
   private int[] queue;
   int max;
   protected LinearQueue(int sizeOf){
   this.queue = new int[sizeOf];
   this.max = sizeOf;
   }
   
   protected void insert(int val){
       if (rear==max-1) {
           System.out.println("OVERFLOW");
           return;
       }else if(front==-1){
       front=rear=0;
       }else{
       rear=rear+1;
       }
       
       queue[rear]=val;
   }
   
   protected void print(){
//       System.out.println(queue[rear]);
       for (int i = front; i <= rear; i++) {
           System.out.print(queue[i] + " ");
       }
   }
   
   protected void deQueue(){
       if (front==-1) {
           System.out.println("Queue is empty");
           return;
       }
    
   }
}
