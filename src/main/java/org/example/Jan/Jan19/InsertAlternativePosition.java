package org.example.Jan.Jan19;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Using Iterative Method – O(n) Time and O(1) Space:
//The idea is to start traversing from the beginning of both lists. For each step, take a node from the second list
// and insert it after a node from the first list. This process continues until we
// reach the end of one or both lists. If the second list is longer, remaining nodes will be kept as it is second list.
public class InsertAlternativePosition {

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

    // Function to print a linked list
    static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
    static List<Node> merge(Node head1, Node head2) {

        Node temp1 = head1;
        Node temp2 = head2;

        while (temp1 != null && temp2 != null)
        {
            Node ptr1 = temp1.next;
            Node ptr2 = temp2.next;

            temp2.next = temp1.next;
            temp1.next = temp2;

            temp1 = ptr1;
            temp2 = ptr2;
        }
        return Arrays.asList(head1, temp2);
    }

        public static void main(String[] args) {

        // Creating first linked list 1->2->3
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);

        // Creating second linked list 4->5->6->7->8
        Node head2 = new Node(4);
        head2.next = new Node(5);
        head2.next.next = new Node(6);
        head2.next.next.next = new Node(7);
        head2.next.next.next.next = new Node(8);

        // Store first and second head points in array
        List<Node> ar = merge(head1, head2);
        printList(ar.get(0));
        printList(ar.get(1));
    }
}
