package org.example.DSA;

public class singlelinkedlist {
    private ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        singlelinkedlist singlelinkedlist = new singlelinkedlist();
        singlelinkedlist.head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);

        singlelinkedlist.head.next = second;
        second.next = third;
        third.next = fourth;

//        singlelinkedlist.addLinkelist(66);
//        singlelinkedlist.addLast(22);
//        singlelinkedlist.insert(1,11);

        singlelinkedlist.display();

//        System.out.println(singlelinkedlist.deleteFirst().data);
//        System.out.println(singlelinkedlist.count());
//        System.out.println(singlelinkedlist.deleteLast().data);
//        System.out.println(singlelinkedlist.search(821));
//        singlelinkedlist.delete(3);
//        singlelinkedlist.display();


//        ListNode reverse = singlelinkedlist.reverse(second);
        System.out.println(singlelinkedlist.getNthnodefromEnd(3).data);
        singlelinkedlist.uniqueSortedList();
        ListNode fifth = new ListNode(3);
//        System.out.println(singlelinkedlist.addElement(fifth));
        singlelinkedlist.deleteNode(8);
        singlelinkedlist.display();
    }
public void deleteNode(int key)
{
    ListNode current = head;
    ListNode temp = null;

    if (current != null && current.data == key)
    {
        head = current.next;
        return;
    }
    while (current != null && current.data != key)
    {
        temp = current;
        current = current.next;
    }

    if (current == null)
    {
        return ;
    }
    temp.next = current.next;

}
    public ListNode addElement(ListNode newnode)
    {
        if(head == null)
        {
            return newnode;
        }
    ListNode current = head;
    ListNode temp = null;

    while (current != null && current.data < newnode.data)
    {
        temp = current;
        current = current.next;
    }
    newnode.next = current;
    temp.next = newnode;
    return head;
    }

    public void uniqueSortedList() {
        if (head == null)
        {
            return ;
        }
        ListNode current = head;
        while (current != null && current.next != null) {

            if (current.data == current.next.data)
            {
                current.next = current.next.next;

            }
            else
            {
                current = current.next;
            }
        }
    }
    public ListNode getNthnodefromEnd(int n)
    {
        if (head == null)
        {
            return null;
        }
        if (n <= 0)
        {
            throw new IllegalArgumentException("Initital value of n "+ n);
        }
        ListNode mainPtr = head;
        ListNode reffPtr = head;

        int count = 0;
        if (reffPtr == null)
        {
            throw  new IllegalArgumentException("Greater than number of list is "+n);
        }
        while (count < n)
        {
            reffPtr = reffPtr.next;
            count++;
        }
        while ((reffPtr != null))
        {
            reffPtr  = reffPtr.next;
            mainPtr = mainPtr.next;
        }
        return mainPtr;

    }

    public ListNode reverse(ListNode head)
    {
        if (head == null)
        {
            return head;
        }
        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;
        while(current != null)
        {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;

        }
        return previous;

    }

    public boolean search(int searchKey)
    {
        ListNode current = head;
        while(current!= null)
        {
            if (current.data == searchKey)
            {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void delete(int position)
    {
        if (position == 1)
        {
            head = head.next;
        }
        else
        {
            ListNode previous = head;
            int count = 1;
            while (count < position - 1)
            {
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next = current.next;
        }

    }

    public ListNode deleteFirst()
    {
    if(head == null)
    {
        return null;
    }
    ListNode temp = head;
    head = head.next;
    temp.next = null;
    return temp;


    }

    public ListNode deleteLast()
    {
        if (head == null || head.next == null)
        {
            return head;
        }
        ListNode current = head;
        ListNode previous = null;
        while (current.next != null)
        {
            previous = current;
            current = current.next;
        }
        previous.next = null;
        return current;
    }

    public void insert(int position, int value)
    {
        ListNode node = new ListNode(value);
        if (position == 1)
        {
            node.next = head;
            head = node;
        }
        else {
            ListNode previous = head;
            int count = 1;

            while (count < position -1)
            {
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next = node;
            node.next = current;
        }
    }

    public void addLinkelist(int value)
    {
        ListNode listNode = new ListNode(value);
        listNode.next = head;
        head = listNode;

    }
    public void addLast(int value)
    {
        ListNode listNode = new ListNode(value);
        if (head == null)
            head = listNode;

        ListNode current = head;
        while (null != current.next)
            current = current.next;

        current.next = listNode;
    }

    public int count()
    {
        if (head == null)
        {
            return 0;
        }
        ListNode current = head;
        int count = 0;
        while (current != null)
        {
            count++;
            current = current.next;
        }
        return count;
    }


    public void display()
    {
        ListNode current = head;
        while (current != null)
        {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
