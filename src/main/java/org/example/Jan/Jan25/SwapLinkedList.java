package org.example.Jan.Jan25;


import org.example.Jan.Jan23.LengthofloopLinkedLlist;

public class SwapLinkedList {
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
            curr=curr.next;
        }
        System.out.println();
    }
    public static void SwapLinkedListK(Node head, int k)
    {
        if (head == null || k <= 0)
        {
            return ;
        }
        Node first = head;
        for (int i = 1; i < k; i++) {
            if (first == null) return;
            first = first.next;
        }

        Node fast = first;
        Node slow = head;
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // swap values
        int temp = first.data;
        first.data = slow.data;
        slow.data = temp;

    }

    public static void main(String[] args) {
        // 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> NULL
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        int k=2;

        SwapLinkedListK(head, k);
        printList(head);
    }
}
