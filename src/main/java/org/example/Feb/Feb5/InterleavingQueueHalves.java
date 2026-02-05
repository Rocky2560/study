package org.example.Feb.Feb5;

//Given a queue q[] of even size. Rearrange the elements by interleaving the first half with the second half.
//
//Note: Interleaving means take one element from the first half, then one element from the second half,
// then the next element from the first half, then the next element from the second half,
// and continue this process until the queue is fully rearranged.

//[Expected Approach 1] Using Stack - O(n) Time and O(n) Space
//The idea is to place the first half of the elements into a stack (so that the top holds the first element) and
// keep the second half in the queue
//
//First, we want the first half of the queue to be reversed so that we can interleave properly.
// To do this, we push the first half into a stack (stack naturally reverses order).
//But since we need them later in their original order for interleaving, we enqueue them back and
// then dequeue the first half again. This ensures when we push them into the stack this time,
// they end up in the right sequence for interleaving.
//Finally, we take elements alternately from the stack and the queue and insert them back into the queue,
// which produces the interleaved arrangement.
//Note : In JavaScript, there is no built-in queue data structure, so we create a custom queue class.

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class InterleavingQueueHalves {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(2);
        q.add(4);
        q.add(3);
        q.add(1);
//        rearrangeQueue(q);
        rearrangeQueueArray(q);
        int length = q.size();
        for (int i = 0; i < length; i++) {
            System.out.print(q.poll() + " ");
        }
    }

    private static void rearrangeQueue(Queue<Integer> q) {
        Stack<Integer> stack = new Stack<>();
        int halfSize = q.size()/2;

        for (int i = 0; i < halfSize; i++) {
            stack.push(q.poll());
        }

        while (!stack.isEmpty())
        {
            q.add(stack.pop());

        }
        for (int i = 0; i < halfSize; i++) {
            q.add(q.poll());

        }

        for (int i = 0; i < halfSize; i++) {
            stack.push(q.poll());
        }

        // interleave the elements of queue and stack
        while (!stack.isEmpty()) {
            q.add(stack.pop());
            q.add(q.poll());
        }
    }

//    [Expected Approach 3] Getting Result in an Array - O(n) Time and O(n) Space
//The approach works by splitting the queue into two halves and then placing their elements
// alternately into a result array. Elements from the first half are placed at even positions,
// while elements from the second half are placed at odd positions. This way, the final array naturally
// forms an interleaved order of the two halves.

    public static void rearrangeQueueArray(Queue<Integer> q) {
        int n = q.size();
        int [] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = q.poll();
            
        }
        // Interleave elements back into the queue
        for (int i = 0; i < n / 2; i++) {
            q.add(arr[i]);
            q.add(arr[i + n / 2]);
        }

    }

}
