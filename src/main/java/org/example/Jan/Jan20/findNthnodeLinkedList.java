package org.example.Jan.Jan20;

public class findNthnodeLinkedList {

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
        Node curr = head;
        while (curr != null)
        {
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(35);
        head.next = new Node(15);
        head.next.next = new Node(4);
        head.next.next.next = new Node(20);
//        printList(head);

        // Function Call to find the 4th node from end
        System.out.println(findNthFromLast(head, 4));
    }

    static int findNthFromLast(Node head, int N) {
        int len = 0, i;

        // Pointer to store the copy of head
        Node temp = head;

        // Count the number of nodes in Linked List
        while (temp != null) {
            temp = temp.next;
            len++;
        }

        // Check if value of N is not more than length of the linked list
        if (len < N)
            return -1;

        temp = head;

        // Get the (len - N + 1)th node from the beginning
        for (i = 1; i < len - N + 1; i++)
            temp = temp.next;

        return temp.data;
    }
}
