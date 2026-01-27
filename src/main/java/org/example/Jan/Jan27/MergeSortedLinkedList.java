package org.example.Jan.Jan27;

import java.util.ArrayList;
import java.util.Collections;

public class MergeSortedLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int x)
        {
            data = x;
            next = null;
        }
    }

    static void printList(Node curr) {
        while (curr != null) {
            System.out.print(curr.data);
            if (curr.next != null) {
                System.out.print(" -> ");
            }
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Node head1 = new Node(5);
        head1.next = new Node(10);
        head1.next.next = new Node(15);
        head1.next.next.next = new Node(40);

        Node head2 = new Node(2);
        head2.next = new Node(3);
        head2.next.next = new Node(20);

        Node res = sortedMerge(head1, head2);
        printList(res);
    }

    static Node sortedMergeApproach(Node head1, Node head2) {

        // base cases
        if (head1 == null)
            return head2;
        if (head2 == null)
            return head1;

        // recursive merging based on smaller value
        if (head1.data <= head2.data) {
            head1.next = sortedMerge(head1.next, head2);
            return head1;
        }
        else {
            head2.next = sortedMerge(head1, head2.next);
            return head2;
        }
    }

    private static Node sortedMerge(Node head1, Node head2) {
        ArrayList<Integer> arr = new ArrayList<>();

        // pushing the values of the first linked list
        while (head1 != null) {
            arr.add(head1.data);
            head1 = head1.next;
        }

        // pushing the values of the second linked list
        while (head2 != null) {
            arr.add(head2.data);
            head2 = head2.next;
        }

        // sorting the list
        Collections.sort(arr);

        // creating a new list with sorted values
        Node dummy = new Node(-1);
        Node curr = dummy;

        for (int i = 0; i < arr.size(); i++) {
            curr.next = new Node(arr.get(i));
            curr = curr.next;
        }

        return dummy.next;
    }

}
//[Naive Approach] By Using Array - O((n+m) × log(n+m)) Time and O(n+m) Space
//The idea is to use an array to store all the node data from both linked lists,
// sort the array, and then construct the resultant sorted linked list from the array elements.
//[Better Approach] Using Recursive Merge - O(n+m) Time and O(n+m) Space
//The idea is to pick the smaller head node at each step and let recursion merge the remaining parts.
// if one list is empty, return the other; otherwise the smaller node becomes the next node in the merged list and
// its next is the recursive merge of the rest.
//
//Algorithm:
//
//If head1 is null, return head2.
//If head2 is null, return head1.
//Compare head1.data and head2.data.
//If head1.data <= head2.data:
//        => set head = head1
//        => set head.next = merge(head1.next, head2)
//Else:
//        => set head = head2
//        => set head.next = merge(head1, head2.next)
//Return head.
//https://www.geeksforgeeks.org/dsa/merge-two-sorted-linked-lists/

//[Efficient Approach] Using Iterative Merge - O(n+m) Time and O(1) Space
//The idea is to iteratively merge two sorted linked lists using a dummy node to simplify the process.
// A current pointer tracks the last node of the merged list. We compare the nodes from both lists and
// append the smaller node to the merged list. Once one list is fully traversed,
// the remaining nodes from the other list are appended.
// The merged list is returned starting from the node after the dummy node.