package org.example.Jan.Jan8;

//[Naive Approach] Using Recursion - O(n) Time and O(n) Space
//The idea is to reverse the doubly linked list by swapping the next and prev pointers of each node.
// Once the pointers of the current node are swapped, we make a recursive call on the new prev pointer
// (which originally was the next node) to process the rest of the list.


//[Expected Approach] Using Two Pointers - O(n) Time and O(1) Space
//The idea is to reverse doubly linked list using two pointers for traversing through the list and
// swapping the next and previous pointers of every two consecutive nodes.
//
//Step-by-step algorithm:
//
//Initially, prevNode is set to NULL and currNode starts at the head.
//As the list is traversed,
//=> Swap the currNode->next and currNode->prev
//=> Move currNode to the next node, currNode = currNode->prev.
//After traversing all the nodes, prevNode will point to the second node of the reversed list,
// so update the previous pointer of prevNode as the new head of the linked list,
// head = prevNode->prev and return it.

public class REverseDoublyLinkeList {
    static class Node
    {
        int data;
        Node next, prev;
        public Node(int d)
        {
           data = d;
            next = prev = null;
        }
    }
    static Node head;

    public static Node reverse(Node curr)
    {
        if (curr == null) return null;

        Node temp = curr.prev;
        curr.prev = curr.next;
        curr.next = temp;

        if (curr.prev == null) return curr;
        return reverse(curr.prev);
    }

    public static Node reverseTwoPointer(Node head)
    {
        if (head == null || head.next == null) {
            return head;
        }

        Node currNode = head;
        Node prevNode = null;

        // Traverse the list and reverse the links
        while (currNode != null) {

            // Swap the next and prev pointers
            prevNode = currNode.prev;
            currNode.prev = currNode.next;
            currNode.next = prevNode;

            // Move to the next node in the original list
            // (which is now previous due to reversal)
            currNode = currNode.prev;
        }

        head = prevNode.prev;

        return head;
    }

    static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data);
            if(node.next != null){
                System.out.print(" <-> ");
            }
            node = node.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {

        head = new Node(1);
        head.next = new Node(2);
        head.next.prev = head;
        head.next.next = new Node(3);
        head.next.next.prev = head.next;

        head = reverse(head);

        printList(head);

        head = reverseTwoPointer(head);
        printList(head);
    }
}
