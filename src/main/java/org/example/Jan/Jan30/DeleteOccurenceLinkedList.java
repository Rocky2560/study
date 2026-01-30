package org.example.Jan.Jan30;

public class DeleteOccurenceLinkedList {
    static class Node
    {
        int data;
        Node next;

        Node(int new_data) {
            data = new_data;
            next = null;
        }
    }

    // This function prints the contents of the linked list
    // starting from the head
    static void printList(Node curr) {
        while (curr != null) {
            System.out.print(" " + curr.data);
            curr = curr.next;
        }
    }

    static Node deleteOccurrences(Node head, int key) {
        Node curr = head, prev = null;

        while (curr != null) {
            if (curr.data == key) {
                if (prev == null) {
                    head = curr.next;
                } else {
                    prev.next = curr.next;
                }

                curr = curr.next;
            } else {
                prev = curr;
                curr = curr.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        // Create a hard-coded linked list:
        // 2 -> 2 -> 1 -> 8 -> 2 -> NULL
        Node head = new Node(2);
        head.next = new Node(2);
        head.next.next = new Node(1);
        head.next.next.next = new Node(8);
        head.next.next.next.next = new Node(2);

        int key = 2;

        head = deleteOccurrences(head, key);
        printList(head);
    }
}
