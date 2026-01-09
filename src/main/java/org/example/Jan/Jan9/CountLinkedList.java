package org.example.Jan.Jan9;

//[Naive Approach] By Recursion – O(n) time and O(n) space
//The idea is similar to the iterative approach. Here we are using the recursion to check if the node value
// equals to key or not. Please note that the iterative approach would be better in terms of time and space.
// The recursive approach can be good fun exercise or a question in an interview / exam.
public class CountLinkedList {

    static class Node
    {
        int data;
        Node next;
        Node (int d)
        {
            data= d;
            next=null;
        }
    }

    public static int count(Node head, int key)
    {
        if (head == null) return 0;

        int ans = count(head.next, key);
        if (head.data == key) ans++;

        return ans;
    }
    // Method to count occurrences of a value in the linked
    // list
    static int countIterative(Node head, int key) {
        Node curr = head;
        int count = 0;
        while (curr != null) {
            if (curr.data == key) {
                count++;
            }
            curr = curr.next;
        }
        return count;
    }
    public static void main(String[] args) {

        // Hard coded linked list:
        // 1 -> 2 -> 1 -> 2 -> 1
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(1);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(1);

        int key = 1;

        System.out.println(count(head, key));
        System.out.println(countIterative(head ,key));
    }
}


//[Expected Approach] By Traversing each node – O(n) time and O(1) space
//The idea is to traverse through the each node of linked list and check
// if the node data is equal to the key or not. If it is equal to key we will increment the count.