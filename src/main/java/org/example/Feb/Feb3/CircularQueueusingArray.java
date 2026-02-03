package org.example.Feb.Feb3;

public class CircularQueueusingArray {

    public static class Queue {
        private int[] arr;
        private int capacity;
        private int front;
        private int size;

        public Queue(int cap) {
            capacity = cap;
            arr = new int[capacity];
            front = 0;
            size = 0;
        }

        public void enqueue(int x) {
            if (size == capacity) {
                System.out.println("Queue is full");
            }
            int rear = (front + size) % capacity;
            arr[rear] = x;
            size++;
        }

        // Remove an element from the front
        public int dequeue() {
            if (size == 0) {
                System.out.println("Queue is empty!");
                return -1;
            }
            int res = arr[front];
            front = (front + 1) % capacity;
            size--;
            return res;
        }
        // Get the rear element
        public int getRear() {
            if (size == 0)
                return -1;
            int rear = (front + size - 1) % capacity;
            return arr[rear];
        }
        // Get the front element
        public int getFront() {
            if (size == 0)
                return -1;
            return arr[front];
        }
    }

    public static void main(String[] args) {
            Queue q = new Queue(5);
            q.enqueue(10);
            q.enqueue(20);
            q.enqueue(30);
            System.out.println(q.getFront() + " " + q.getRear());
            q.dequeue();
            System.out.println(q.getFront() + " " + q.getRear());
            q.enqueue(40);
            System.out.println(q.getFront() + " " + q.getRear());
    }
}
