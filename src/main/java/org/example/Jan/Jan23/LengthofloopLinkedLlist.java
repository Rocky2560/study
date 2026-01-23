package org.example.Jan.Jan23;

import java.util.HashSet;

public class LengthofloopLinkedLlist {
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

    static int countLoopLength(Node head)
    {
        HashSet<Node> hashSet = new HashSet<>();
        int count = 0;
        Node current = head;

        while (current != null)
        {
            if (hashSet.contains(current))
            {
                Node startOfLoop = current;
                do {
                    count++;
                    current = current.next;
                }while (current != startOfLoop);
            }
            hashSet.add(current);
            current = current.next;
        }
        return 0;

    }

    static int counttheloop(Node head)
    {
        int count =1;
        Node curr = head;
     while (curr.next != head)
     {
         count++;
         curr = curr.next;

     }
     return count;
    }

    static int coundLoopFlyoyds(Node head)
    {
        Node slow =head, fast = head;
        Node curr = head;
        while (slow != null && fast != null
                && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
            {
                counttheloop(curr);
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        // 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> NULL
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);

        System.out.println(countLoopLength(head));
        System.out.println(coundLoopFlyoyds(head));
    }
}
