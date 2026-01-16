package org.example.Jan.Jan16;

public class QueueLinkedList {

    private Node front;
    private Node rear;
    private int currSize;

    static class Node
    {
        int data;
        Node next;
        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public static void printList(Node head)
    {
        if (head != null)
        {
            System.out.println(head.data + " -> ");
            head = head.next;
        }
    }

    public QueueLinkedList()
    {
     currSize = 0;
     front= rear = null;
    }

    public boolean idEmpty()
    {
        return front == null;
    }

    public int frontData()
    {
        if (idEmpty()) {
            System.out.println("EMpty data list");
            return -1;
        }
        return front.data;
        }


    // Enqueue operation
    public void enqueue(int new_data) {
        Node new_node = new Node(new_data);
        if (idEmpty()) {
            front = rear = new_node;
        } else {
            rear.next = new_node;
            rear = new_node;
        }

        currSize++;
    }

    // Dequeue operation (returns removed element)
    public int dequeue() {
        if (idEmpty()) {
            System.out.println("Queue Underflow");
            return -1;
        }
        Node temp = front;
        int removedData = temp.data;
        front = front.next;
        if (front == null) rear = null;

        currSize--;
        return removedData;
    }

    // Return size of the queue
    public int size() {
        return currSize;
    }



    public static void main(String[] args) {
        QueueLinkedList q = new QueueLinkedList();

        q.enqueue(10);
        q.enqueue(20);

        System.out.println("Dequeue: " + q.dequeue());

        q.enqueue(30);

        System.out.println("Front: " + q.frontData());
        System.out.println("Size: " + q.size());
    }
}
