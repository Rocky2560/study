package org.example.Jan.Jan6;

//Given the head of singly linked list, find middle node of the linked list.
//
//If the number of nodes is odd, return the middle node.
//If the number of nodes is even, there are two middle nodes, so return the second middle node.

public class MiddleNodeLinkedList {

    static class Node
    {
        int data;
        Node next;

        Node(int x)
        {
        this.data = x;
        this.next = null;
        }
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);
        head.next.next.next.next.next.next = new Node(70);
        System.out.println(getMiddle(head));
    }

    private static int getMiddle(Node head) {

        Node slowptr = head;
        Node fastptr = head;

        while(fastptr != null && fastptr.next != null)
        {
            fastptr = fastptr.next.next;
            slowptr = slowptr.next;
        }
        return slowptr.data;
    }
}

//[Expected Approach] Hare and Tortoise Algorithm - O(n) Time and O(1) Space
//We can use the Tortoise and Hare algorithm to find the middle of the linked list.
//
//Initialize both slow and fast pointers at the head.
//Move slow by one step and fast by two steps each iteration.
//When fast reaches the end (or null), slow will be at the middle.
//For even nodes, slow automatically ends at the second middle.