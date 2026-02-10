package org.example.Feb.Feb10;

import java.util.LinkedList;
import java.util.Queue;

public class QueueReverseRecursion {

    static void printQueue(Queue<Integer> q) {
        while (!q.isEmpty()) {
            System.out.print(q.poll() + " ");
        }
    }
    // Recursive function to reverse the queue
    static void reverseQueue(Queue<Integer> q) {

        if (q.isEmpty())
        {
            return;
        }
        int data = q.poll();
        reverseQueue(q);

        q.add(data);
    }
        public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(56);
        q.add(27);
        q.add(30);
        q.add(45);
        q.add(85);
        q.add(92);
        q.add(58);
        q.add(80);
        q.add(90);
        q.add(100);
        reverseQueue(q);
        printQueue(q);
    }
}
