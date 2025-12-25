package org.example.Dec.Dec25;

// Java program to find union and intersection
// of linked list

import java.util.HashSet;
import java.util.Set;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

class GfG {

    static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    // Function to get the intersection of two lists
    static Node getIntersection(Node head1, Node head2) {
        Set<Integer> set = new HashSet<>();
        Node result = null;

        // Traverse the first list and store elements in a
        // hash set
        Node p = head1;
        while (p != null) {
            set.add(p.data);
            p = p.next;
        }

        // Traverse the second list and check for common
        // elements
        p = head2;
        while (p != null) {
            if (set.contains(p.data)) {

                // Insert at the beginning of the result
                // list
                Node newNode = new Node(p.data);
                newNode.next = result;
                result = newNode;
            }
            p = p.next;
        }

        return result;
    }

    // Function to get the union of two lists
    static Node getUnion(Node head1, Node head2) {
        Set<Integer> unionSet = new HashSet<>();
        Node p = head1;
        while (p != null) {
            unionSet.add(p.data);
            p = p.next;
        }

        p = head2;
        while (p != null) {
            unionSet.add(p.data);
            p = p.next;
        }

        Node result = null;
        Node tail = null;

        // Insert all unique values into the result list
        for (int i : unionSet) {
            Node newNode = new Node(i);
            if (result == null) {
                result = newNode;
                tail = newNode;
            }
            else {
                tail.next = newNode;
                tail = tail.next;
            }
        }

        return result;
    }

    // Function to print both union and intersection of two
    // lists
    static void printUnionIntersection(Node head1,Node head2) {
        Node intersectionList = getIntersection(head1, head2);
        Node unionList = getUnion(head1, head2);

        System.out.println("Intersection list is:");
        printList(intersectionList);

        System.out.println("Union list is:");
        printList(unionList);
    }

    public static void main(String[] args) {

        // List 1: 1 -> 2 -> 3 -> 3 -> 4 -> 5
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = new Node(3);
        head1.next.next.next.next = new Node(4);
        head1.next.next.next.next.next = new Node(5);

        // List 2: 1 -> 5 -> 6
        Node head2 = new Node(1);
        head2.next = new Node(5);
        head2.next.next = new Node(6);

        printUnionIntersection(head1, head2);
    }
}
