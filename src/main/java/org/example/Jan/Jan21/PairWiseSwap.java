package org.example.Jan.Jan21;

public class PairWiseSwap {

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
        // Creating the linked list:
        // 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> NULL
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);

        pairwiseSwap(head);

        printList(head);
    }

    private static void pairwiseSwap(Node head) {
        if (head == null || head.next == null)
        {return ;}

        int temp = head.data;
        head.data = head.next.data;
        head.next.data = temp;

        pairwiseSwap(head.next.next);

    }
}
