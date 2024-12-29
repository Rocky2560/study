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
        singlelinkedlist.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);

        singlelinkedlist.head.next = second;
        second.next = third;
        third.next = fourth;

        singlelinkedlist.addLinkelist(66);
        singlelinkedlist.addLast(22);
        singlelinkedlist.display();

        System.out.println(singlelinkedlist.count());
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
