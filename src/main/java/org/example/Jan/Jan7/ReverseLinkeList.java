package org.example.Jan.Jan7;

import java.util.Stack;

public class ReverseLinkeList {

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        head = reverseList(head);
        printList(head);

        head = reverseListStack(head);
        printList(head);
    }

    static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data);
            if (node.next != null) {
                System.out.print(" -> ");
            }
            node = node.next;
        }
    }

    private static Node reverseList(Node head) {
        Node curr = head, prev = null, next;
        while (curr != null) {
            next = curr.next;

            curr.next = prev;

            prev = curr;
            curr = next;

        }
        return prev;
    }

    static Node reverseListStack(Node head) {
        Stack<Node> stack = new Stack<>();
        Node temp = head;

        while (temp != null)
        {
            stack.push(temp);
            temp = temp.next;
    }

        if (!stack.isEmpty())
        {
            head = stack.pop();
            temp = head;

            while (!stack.isEmpty())
            {
                temp.next = stack.pop();
                temp = temp.next;
            }
            temp.next = null;
        }
        return head;
}

}
