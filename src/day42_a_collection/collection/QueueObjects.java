package day42_a_collection.collection;

import java.util.PriorityQueue;

public class QueueObjects {
    public static void main(String[] args) {

        //add --- offer
        //remove -- poll
        //get -- element
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>(); // insertion order is NOT kept - does NOT allow null

        priorityQueue.add(2);
        priorityQueue.add(10);
        priorityQueue.add(8);
        priorityQueue.add(1);
        priorityQueue.add(2); // duplicates are allowed
        //priorityQueue.add(null); // null is NOT allowed

        System.out.println(priorityQueue);
        priorityQueue.offer(30);
        System.out.println(priorityQueue);
        priorityQueue.offer(1);
        System.out.println(priorityQueue);

        System.out.println();

        System.out.println(priorityQueue.poll());   // FIFO -- > First in First Out -- > first one was removed - also returns what was removed - once the element is removed, there a new order may happen.
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.poll());   // FIFO -- > First in First Out -- > first one was removed
        System.out.println(priorityQueue);




    }
}