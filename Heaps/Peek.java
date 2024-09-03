package Heaps;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Peek {
    public static void main(String[] args) {
        PriorityQueue queue = new PriorityQueue<>(Comparator.reverseOrder());  // Comparator is an interface use to compare to adjacent value 
        queue.add(1);
        queue.add(2);
        queue.add(8);
        queue.add(5);
        queue.add(4);
        queue.add(3);
        System.out.println(queue+"inserted element"+"\n");// O(logn)
        while (!queue.isEmpty()) {
            System.out.println(queue.peek());
            queue.remove();
            
        }   
        System.out.println("Peeked element");
        
    }
}
