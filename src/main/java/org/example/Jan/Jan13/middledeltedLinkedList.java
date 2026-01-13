package org.example.Jan.Jan13;

//Given a singly linked list, the task is to delete the middle node of the list.
//
//If the list contains an even number of nodes, there will be two middle nodes. In this case, delete the second middle node.
//If the linked list consists of only one node, then return NULL.

public class middledeltedLinkedList {

    static class Node {
        int data;
        Node next;

        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public static void printList(Node head)
    {
        Node temp = head;
         while (temp != null)
         {
        System.out.println(temp.data + " -> ");
        temp = temp.next;
          }
        System.out.println("null");
    }

    public static Node deleteMid(Node head)
    {
        if (head.next == null) {
            return null;
        }
        int count = 0;
        Node p1 = head, p2 = head;

        while (p1 != null){ count++; p1=p1.next;}

        int middle = count/2;

        for (int i =0; i < middle-1; i++)
        {
            p2 = p2.next;
        }
        p2.next = p2.next.next;
        return head;
    }

    public static  Node deleteMidPointer(Node head)
    {
     if (head == null) {return null;}

     if (head.next == null) {return null;}

     Node prev = null;
     Node slow_ptr = head;
     Node fast_ptr = head;

     while (fast_ptr != null && fast_ptr.next!= null)
     {
         fast_ptr = fast_ptr.next.next;
         prev = slow_ptr;
         slow_ptr = slow_ptr.next;
     }
     prev.next= slow_ptr.next;
     return head;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(4);
        head.next.next.next = new Node(5);
        System.out.println("Original Linked List");
        printList(head);

        System.out.println("After Deletion:");
        deleteMid(head);
        printList(head);

        deleteMidPointer(head);
        printList(head);

    }
}

//The basic idea behind this approach is to first traverse the entire linked list to count the total number of nodes.
// Once we know the total number of nodes, we can calculate the position of the middle node,
// which is at index n/2 (where n is the total number of nodes). Then go through the linked list again,
// but this time we stop right before the middle node. Once there, we modify the next pointer of the node
// before the middle node so that it skips over the middle node and points directly to the node after it,



//The above solution requires two traversals of the linked list. The middle node can be deleted using one traversal.
// The idea is to use two pointers, slow_ptr, and fast_ptr. The fast pointer moves two nodes at a time,
// while the slow pointer moves one node at a time. When the fast pointer reaches the end of the list,
// the slow pointer will be positioned at the middle node. Next, you need to connect the node that comes
// before the middle node (prev) to the node that comes after the middle node. This effectively skips over the
// middle node, removing it from the list.