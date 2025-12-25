package org.example.Dec.Dec25;


public class Union_Intersection_of_two_Linked_Lists {

    static class Node
        {
        int data;
        Node next;

        Node(int x)
            {
                data = x;
                next = null;
            }

    }

    // Function to check if a value is present in the linked list
    static boolean isPresent(Node head, int value) {
        Node curr = head;
        while (curr != null) {
            if (curr.data == value) {
                return true;
            }
            curr = curr.next;
        }
        return false;
    }

    static Node findUnion(Node head1, Node head2)
    {
        Node result = null;
        Node tail = null;
        Node curr1 = head1, curr2 = head2;

//
        // Insert all elements from the first
        // list into the result list
        while (curr1 != null)
        {
            if (!isPresent(result, curr1.data))
            {
                Node newNode = new Node(curr1.data);
                if (result == null)
                {
                    result = newNode;
                    tail = result;
                }
                else
                {
                    tail.next = newNode;
                    tail = newNode;
                }
            }
            curr1 = curr1.next;
        }

        // Insert elements from the second list into the
        // result list if they are not already present

        while (curr2 != null)
        {
            if (!isPresent(result, curr2.data))
            {
                Node newNode = new Node(curr2.data);
                if (result == null)
                {
                    result = newNode;
                    tail = result;
                }
                else
                {
                    tail.next= newNode;
                    tail = newNode;
                }
            }
            curr2 = curr2.next;
        }

        return result;
    }

    static Node findIntersection(Node head1, Node head2) {
        Node result = null, tail = null;
        Node curr1 = head1;

        while (curr1 != null) {
            if (isPresent(head2, curr1.data) && !isPresent(result, curr1.data)) {
                Node newNode = new Node(curr1.data);
                if (result == null) {
                    result = tail = newNode;
                } else {
                    tail.next = newNode;
                    tail = newNode;
                }
            }
            curr1 = curr1.next;
        }
        return result;
    }

    static void printList(Node head)
    {
        Node curr = head;
        while (curr != null)
        {
            System.out.println(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // Insert elements into the first linked list
        // 10 -> 15 -> 4 -> 20
        Node head1 = new Node(10);
        head1.next = new Node(15);
        head1.next.next = new Node(4);
        head1.next.next.next = new Node(20);

        // Insert elements into the second linked list
        // 8 -> 4 -> 2 -> 10
        Node head2 = new Node(8);
        head2.next = new Node(4);
        head2.next.next = new Node(2);
        head2.next.next.next = new Node(10);

        Node unionList = findUnion(head1, head2);
        Node intersectionList = findIntersection(head1, head2);

        System.out.print("Union: ");
        printList(unionList);

        System.out.print("Intersection: ");
        printList(intersectionList);
    }


}
