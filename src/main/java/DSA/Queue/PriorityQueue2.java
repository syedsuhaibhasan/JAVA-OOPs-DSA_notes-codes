package DSA.Queue;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueue2 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); 
        pq.add(1);
        pq.add(9);
        pq.add(19);
        pq.add(3);
        pq.add(5);
        pq.add(6);
//        System.out.println("WRONG DESC ORDER");
        System.out.println(pq);
        System.out.println("RIGHT DESC ORDER");
        System.out.print("[");
        while(!pq.isEmpty()){
            System.out.print(pq.poll()+" ");
        }
        System.out.println("]");
    }
}
