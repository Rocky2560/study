package org.example.Jan.Jan12;

//Approach:
//
//The idea is to traverse the linked list from beginning to end. While traversing,
// keep track of last occurrence key node and previous node of that key.
// After traversing the complete list, delete the last occurrence of that key.
//
//Follow the steps below to solve the problem:
//
//Initialize Pointer curr points to head, last, lastPrev and prev to NULL.
//Traverse the List until curr is not NULL:
//If curr->data == key, update lastPrev to the prev and last to curr.
//Move prev pointer to curr and curr to the next node.
//Delete Last Occurrence (if key was found then last is not null):
//If lastPrev is not null, adjust lastPrev->next = last->next to skip last.
//If last is the head, update the head to last->next.

public class DeleteLastOccureneceLL {
    static class Node
    {
    int data;
    Node next;
    public Node(int data)
    {
        this.data= data;
        this.next = null;
    }
    }

    static Node deleteLastOccurrence(Node head, int key)
    {
        Node last=null, lastPrev=null;
        Node curr = head, prev = null;

        while (curr != null)
        {
            if (curr.data == key)
            {
                lastPrev = prev;
                last = curr;
            }
            prev = curr;
            curr = curr.next;
        }
        if (last != null)
        {
            if (lastPrev != null)
            {
                lastPrev.next = last.next;
            }
            else
            {
                head = head.next;
            }
        }
        return head;
    }

    public static void print (Node curr)
    {
    while (curr != null)
    {
        System.out.println(curr.data + " ");
        curr = curr.next;
    }
        System.out.println();
    }

    public static void main(String[] args) {

        // Create a hard-coded linked list:
        // 1 -> 2 -> 2 -> 4 -> 2
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(2);

        int key = 2;
        head = deleteLastOccurrence(head, key);
        print(head);
    }

}
