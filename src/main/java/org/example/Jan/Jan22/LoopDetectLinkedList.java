package org.example.Jan.Jan22;

import org.example.Jan.Jan21.PairWiseSwap;

import java.util.HashSet;

public class LoopDetectLinkedList {

    static class Node
    {
        int data;
        Node next;
        public Node (int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    public static boolean checkLoop(Node head)
    {
        HashSet<Integer> hashSet = new HashSet<>();
        while (head != null)
        {
            if (!hashSet.contains(head.data))
            {
                hashSet.add(head.data);
                head = head.next;
            }
            else
            {
                return true;
            }
        }
        return false;
    }
    static boolean detectLoop(Node head) {
    Node slow = head, fast =head;

    while (slow != null && fast != null  && fast.next != null)
    {
        slow = slow.next;
        fast = fast.next.next;

        if (slow == fast)
        {
            return true;
        }
    }
        return false;
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

        System.out.println(checkLoop(head));
        System.out.println(detectLoop(head));
    }
}
