package org.example.DSA;

import java.util.NoSuchElementException;

public class circularlinkedlist {

    private ListNode last;
    private int length;

    private class ListNode {
        private ListNode next;
        private int data;

        public ListNode(int data) {
            this.data = data;
        }
    }

    public circularlinkedlist()
    {
        last = null;
        length = 0;
    }

    public int length()
    {
        return length;
    }

    public boolean isEmpty()
    {
        return length == 0;
    }

    //Displaying the circular linkedlist
    public void display()
    {
        if (last == null)
        {
            return;
        }
        ListNode first = last.next;
        while (first != last)
        {
            System.out.print(first.data + " ");
            first = first.next;
        }
        System.out.println(first.data);
    }

    //Adding node at beginning of circular list
    public void insertFirst(int value)
    {
        ListNode temp = new ListNode(value);
        if (last == null)
        {
            last = temp;
        }
        else
        {
            temp.next = last.next;
        }
        last.next = temp;
        length++;
    }

    //Inserting the node at last of the circular linkedlist
    public void insertEnd(int value)
    {
        ListNode temp = new ListNode(value);
        if (last == null)
        {
            last = temp;
            last.next = last;
        }
        else
        {
            temp.next = last.next;
            last.next = temp;
            last = temp;
        }
        length++;
    }

    //REmoving first node in circular linkedlist
    public ListNode removeFirstNode()
    {
        if (isEmpty())
        {
            throw  new NoSuchElementException();
        }
        ListNode temp = last.next;
        if (last.next == last)
        {
            last = null;
        }
        else
        {
            last.next = temp.next;
        }
        temp.next = null;
        length--;
        return temp;
    }


    public void createCircularLinkedList()
    {
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(12);
        ListNode third = new ListNode(123);
        ListNode fourth = new ListNode(1234);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = first;

        last = fourth;

    }

    public static void main(String[] args) {
        circularlinkedlist circularlinkedlist = new circularlinkedlist();
        circularlinkedlist.createCircularLinkedList();
        circularlinkedlist.insertFirst(333);
        circularlinkedlist.insertFirst(2121);
        circularlinkedlist.insertEnd(456);
        circularlinkedlist.display();

        circularlinkedlist.removeFirstNode();
        circularlinkedlist.removeFirstNode();

        circularlinkedlist.removeFirstNode();
        circularlinkedlist.display();

    }
}
