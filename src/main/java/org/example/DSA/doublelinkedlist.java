package org.example.DSA;

import java.util.NoSuchElementException;

public class doublelinkedlist {

    private ListNode  head;
    private ListNode tail;
    private int length;

    private static class ListNode
    {
    private int data;
    private ListNode next;
    private ListNode previous;

    public ListNode (int data)
    {
        this.data = data;
    }
    }
    public doublelinkedlist() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public boolean isEmpty()
    {
        return length == 0;
    }

    public int length()
    {
        return length;
    }

    public void printForwardDirection()
    {
        if (head == null)
        {
            return;
        }
        ListNode temp = head;
        while (temp!= null)
        {
            System.out.print(temp.data+ " -->");
            temp = temp.next;
        }
        System.out.println("null");

    }



    public void printBackwardDirection()
    {
        if (head == null)
        {
            return;
        }
        ListNode temp = tail;
        while (temp != null)
        {
            System.out.print(temp.data + " >--");
            temp = temp.previous;
        }
        System.out.println("null");
    }

    //Inserttin the node at the beginning
    public void insertBeginning(int value)
    {
        ListNode newnode = new ListNode(value);
        if (isEmpty())
        {
            tail = newnode;
        }
        else
        {
            head.previous = newnode;

        }
        newnode.next = head;
        head = newnode;
        length++;
    }

    //Inserting the node in the last of the double linked list
    public void insertLast(int value)
    {
        ListNode newnode = new ListNode(value);
        if (isEmpty())
        {
            head = newnode;
        }
        else
        {
            tail.next = newnode;
        }
        newnode.previous = tail;
        tail = newnode;
        length++;
    }

    //Deleting the node in doubly linked ;ist
    public ListNode deleteFirstNode()
    {
    if (isEmpty())
    {
        throw new NoSuchElementException();
    }
    ListNode temp = head;
    if ( head == tail)
    {
        tail = null;
    }
    else
    {
        head.next.previous = null;
    }
    head = head.next;
    temp.next = null;
    length--;
    return temp;
    }

    //Deeleting the last node in doubly linked list
    public ListNode deletelastNode()
    {
        ListNode temp = tail;
        if (isEmpty())
        {
             throw new NoSuchElementException();
        }
        if (head == tail)
        {
            head = null;
        }
        else
        {
            tail.previous.next = null;
            tail = tail.previous;
        }
        temp.previous = null;
        return temp;

    }


    public static void main(String[] args) {
      doublelinkedlist doublelinkedlist = new doublelinkedlist();
      doublelinkedlist.insertLast(1);
      doublelinkedlist.insertLast(3);
      doublelinkedlist.insertLast(5);
      doublelinkedlist.insertLast(8);

//      doublelinkedlist.printForwardDirection();
//      doublelinkedlist.printBackwardDirection();
//
//      doublelinkedlist.insertBeginning(900);
//      doublelinkedlist.printForwardDirection();
//       doublelinkedlist.deleteFirstNode();
//        doublelinkedlist.deleteFirstNode();
//      doublelinkedlist.printForwardDirection();

      doublelinkedlist.deletelastNode();
        doublelinkedlist.deletelastNode();
        doublelinkedlist.deletelastNode();
      doublelinkedlist.printForwardDirection();

    }
}

