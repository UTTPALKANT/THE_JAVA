package Heaps;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PQ_Demo {
    public static void main(String[] args) {
        PriorityQueue <Integer> pq =new PriorityQueue<>();
        pq.add(1);
        pq.add(5);
        pq.add(2);
        pq.add(8);
        pq.add(1);
        System.out.println("Priority Queues example " +"\n"+pq );
        pq.add(80);
        pq.add(3);
        pq.add(3);
        System.out.println(pq);
        System.out.println("****  Queues example *****");
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(5);
        queue.add(2);
        queue.add(8);
        queue.add(1);
        System.out.println(queue);
        queue.add(80);
        queue.add(3);
        System.out.println(queue);
    }
}
