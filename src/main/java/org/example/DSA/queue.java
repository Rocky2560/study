package org.example.DSA;

import java.util.List;

public class queue {

    private ListNode front;
    private ListNode rear;
    private int length;

    private class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public int length()
    {
        return length;
    }

    public boolean isEmpty()
    {
        return length==0;
    }

    public void insertEnqueue(int value)
    {
        ListNode temp = new ListNode(value);
        if (isEmpty())
        {
            front = temp;
        }
        else
        {
            rear.next = temp;
        }
        rear = temp;
        length++;
    }

    public void print()
    {
        if(isEmpty())
            return;

        ListNode current = front;
        while (current != null)
        {
            System.out.print(current.data + " --> ");
            current = current.next;

        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        queue queueInsert = new queue();
        queueInsert.insertEnqueue(12);
        queueInsert.insertEnqueue(1112);
        queueInsert.insertEnqueue(122);
        queueInsert.print();

    }




}