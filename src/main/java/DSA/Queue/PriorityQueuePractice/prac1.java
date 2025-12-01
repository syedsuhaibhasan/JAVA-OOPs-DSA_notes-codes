/*
A CPU must execute processes based on priority values (lower number = higher priority).
You must use a Priority Queue (Generic Based) to simulate scheduling.
Task
 Write Java code to:
 Insert a process with a priority
 Remove the highest-priority process
 Display the ready queue

Example Input:
Insert P1 priority 3
Insert P2 priority 1
Insert P3 priority 2
OUTPUT: P2 -> P3 -> P1
*/
package DSA.Queue.PriorityQueuePractice;

import java.util.Comparator;
import java.util.PriorityQueue;

 class process <T>{
  T name;
  int priority;

    public process(T name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "process{" + name + '}';
    }
 }

public class prac1 {
    public static void main(String[] args) {
        PriorityQueue<process<String>> TaskManager = new PriorityQueue<>(Comparator.comparingInt(p->p.priority));
        TaskManager.add(new process("P2",1));
        TaskManager.add(new process("P3",1));
        TaskManager.add(new process("P1",3));
        display(TaskManager);
       
    }
    
    public static void display(PriorityQueue<process<String>> queue){
        if (queue.isEmpty()) {
            System.out.println("Empty");
            return;
        }
        PriorityQueue<process<String>> temp = new PriorityQueue<>(queue);
        while(!temp.isEmpty()){
            System.out.print(temp.poll());
            if (!temp.isEmpty()) {
                System.out.print(" -> ");
            }
        }
        System.out.println();
    }    
}
