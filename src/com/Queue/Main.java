package com.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();

        // Adding elements to a queue
        q.offer(null);
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);

        // Printing the queue
        System.out.println(q);

        // Printing the size of the queue
        System.out.println(q.size());

        System.out.println();

        // Looking at the first element in the queue
        System.out.println(q.peek());

        System.out.println();

        // Removing elements from the queue till the queue is empty and printing the queue after
        // removal of an element

        while( !q.isEmpty() )
        {
            // Removing an element from the queue and printing the element removed
            System.out.println(q.poll());
            // Printing the queue after removal of element
            System.out.println(q);
        }

        // If we try to remove an element from an empty queue using the poll() method, then it
        // returns null as the queue was empty and no element was removed
        System.out.println(q.poll());

        System.out.println();
    }

}
