package org.example.Jan.Jan26;

import java.util.HashSet;

public class IntersectionLinkedList {
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

    public static void main(String[] args) {


        // creation of first list: 10 -> 15 -> 30
        Node head1 = new Node(10);
        head1.next = new Node(15);
        head1.next.next = new Node(30);

        // creation of second list: 3 -> 6 -> 9 -> 15 -> 30
        Node head2 = new Node(3);
        head2.next = new Node(6);
        head2.next.next = new Node(9);

        // 15 is the intersection point
        head2.next.next.next = head1.next;

        Node intersectionPoint = intersectPoint(head1, head2);
        Node intersectionPointhashset = intersectPointHashSet(head1, head2);
        Node intesectionTwoPointer = intersectPointTwoPointer(head1, head2);

        if (intersectionPoint == null)
            System.out.println("-1");
        else
            System.out.println(intersectionPoint.data);
        System.out.println(intersectionPointhashset.data);
        System.out.println(intesectionTwoPointer.data);
    }

    private static Node intersectPoint(Node head1, Node head2) {

          while (head2 != null)
          {
              Node curr = head1;
              while (curr != null)
              {
              if (curr == head2)
              {
                  return head2;
              }
                  curr = curr.next;
          }
              head2 = head2.next;
    }
        return null;

}

    private static Node intersectPointHashSet(Node head1, Node head2) {
        HashSet<Node> hashSet = new HashSet<>();

        Node curr1 = head1;
        while (curr1 != null)
        {
            hashSet.add(curr1);
            curr1 = curr1.next;
        }

        Node curr2 = head2;
        while (curr2 != null)
        {
            if (hashSet.contains(curr2))
            {
                return curr2;
            }
            curr2 = curr2.next;
        }
        return null;
    }


    static Node intersectPointTwoPointer(Node head1, Node head2){

        Node ptr1 = head1;
        Node ptr2 = head2;

        if (ptr1 == null || ptr2 == null)
            return null;

        // traverse through the lists until both
        // pointers meet
        while (ptr1 != ptr2) {

            // move to the next node in each list and if the one
            // pointer reaches NULL, start from the other linked list
            ptr1 = (ptr1 != null) ? ptr1.next : head2;
            ptr2 = (ptr2 != null) ? ptr2.next : head1;
        }

        return ptr1;
    }


}
