package org.example.Jan.Jan29;

import java.util.Stack;

public class PalindromeLinkedList {
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

    public static void printlist(Node head)
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
    Node head = new Node(1);
    head.next = new Node(1);
    head.next.next = new Node(2);
    head.next.next.next = new Node(1);
    head.next.next.next.next = new Node(1);
    printlist(head);
        System.out.println(checkPalindromeLL(head));
    }
//[Approach - 1] Using Stack - O(n) Time and O(n) Space
//The idea is to use stack and start traversing from the head node.
// Push all the node and then start comparing from the head node with top value of stack.
//
//Steps to solve the problem:
//
//Push all the node's data into the stack.
//Again traverse from the head node.
//Compare the popped node's data with the current node's data.
//If both are not equal ,return false .
//If all elements match ,return true.
//Check-Palindrome-using-Stack-7_1.webp
    private static boolean checkPalindromeLL(Node head) {
        Stack<Integer> stack= new Stack<>();
        Node curr = head;
        while (curr != null)
        {
            stack.push(curr.data);
            curr = curr.next;
        }

        while (head != null)
        {
            int c = stack.pop();

            if (head.data != c)
            {
                return false;
            }

            head= head.next;
        }
        return true;
    }
}
