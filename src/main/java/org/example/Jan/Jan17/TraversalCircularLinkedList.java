package org.example.Jan.Jan17;

//[Expected Approach - 1] Using Recursion - O(n) Time and O(n) Space:
//To idea is to traverse a circular linked list recursively, we will start by
// printing the value of the current node. Then, recursively call the function to handle the next node.
// If the next node is the same as the head node, indicating that a full cycle has been completed,
// we will end the recursion call.
public class TraversalCircularLinkedList {

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

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next = head;

        printCirculatList(head, head);
        printList(head);

    }

    static void printList(Node head) {

        // return if list is empty
        if (head == null) return;

        Node curr = head;
        do {
            System.out.print(curr.data + " ");
            curr = curr.next;

        } while (curr != head);
        System.out.println();
    }

    private static void printCirculatList(Node head, Node head1) {
        if (head1 == null) {
            return;
        }
        System.out.println(head.data + "->");

        if (head.next == head1)
        {
            return;
        }
        printCirculatList(head.next, head1);
    }
}
