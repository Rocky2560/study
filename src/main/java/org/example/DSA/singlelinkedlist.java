package org.example.DSA;

public class singlelinkedlist {
    private ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
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
        fourth.next = second;

        singlelinkedlist.addLinkedList(66);
        singlelinkedlist.addLast(22);
        singlelinkedlist.insert(1, 11);

        singlelinkedlist.display();

        System.out.println(singlelinkedlist.deleteFirst().data);
        System.out.println(singlelinkedlist.count());
        System.out.println(singlelinkedlist.deleteLast().data);
        System.out.println(singlelinkedlist.search(821));
        singlelinkedlist.delete(3);
        singlelinkedlist.display();

        ListNode reverse = singlelinkedlist.reverse(second);
        System.out.println(singlelinkedlist.getNthNodeFromEnd(3).data);
        singlelinkedlist.uniqueSortedList();
        ListNode fifth = new ListNode(3);
        System.out.println(singlelinkedlist.addElement(fifth).data); // Fixed missing `.data`
        singlelinkedlist.deleteNode(8);
        ListNode loopNode = singlelinkedlist.loopDetect();
        if (loopNode != null) {
            System.out.println(loopNode.data);
        } else {
            System.out.println("No loop detected.");
        }
        singlelinkedlist.loopBreak();

        singlelinkedlist singlelinkedlist1 = new singlelinkedlist();
        singlelinkedlist1.addLast(1);
        singlelinkedlist1.addLast(4);
        singlelinkedlist1.addLast(8);

        singlelinkedlist singlelinkedlist2 = new singlelinkedlist();
        singlelinkedlist2.addLast(3);
        singlelinkedlist2.addLast(5);
        singlelinkedlist2.addLast(14);
        singlelinkedlist2.addLast(18);

        singlelinkedlist result = new singlelinkedlist();
        result.head = mergeLinkedList(singlelinkedlist1.head, singlelinkedlist2.head);
        result.display();
    }

    public static ListNode mergeLinkedList(ListNode a, ListNode b) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while (a != null && b != null) {
            if (a.data < b.data) {
                tail.next = a;
                a = a.next;
            } else {
                tail.next = b;
                b = b.next;
            }
            tail = tail.next;
        }

        tail.next = (a != null) ? a : b;
        return dummy.next;
    }

    public void removeLoop(ListNode slowPtr) {
        ListNode temp = head;
        while (slowPtr.next != temp.next) {
            temp = temp.next;
            slowPtr = slowPtr.next;
        }
        slowPtr.next = null;
    }

    public void loopBreak() {
        ListNode fastPtr = head;
        ListNode slowPtr = head;
        while (fastPtr != null && fastPtr.next != null) {
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if (fastPtr == slowPtr) {
                removeLoop(slowPtr);
                return;
            }
        }
    }

    public ListNode getStartingNode(ListNode slowPtr) {
        ListNode temp = head;
        while (temp != slowPtr) {
            temp = temp.next;
            slowPtr = slowPtr.next;
        }
        return temp;
    }

    public ListNode loopDetect() {
        ListNode fastPtr = head;
        ListNode slowPtr = head;
        while (fastPtr != null && fastPtr.next != null) {
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if (slowPtr == fastPtr) {
                return getStartingNode(slowPtr);
            }
        }
        return null;
    }

    public boolean loopLinkedList() {
        ListNode fastPtr = head;
        ListNode slowPtr = head;
        while (fastPtr != null && fastPtr.next != null) {
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;

            if (fastPtr == slowPtr) {
                return true;
            }
        }
        return false;
    }

    public void deleteNode(int key) {
        ListNode current = head;
        ListNode temp = null;

        if (current != null && current.data == key) {
            head = current.next;
            return;
        }
        while (current != null && current.data != key) {
            temp = current;
            current = current.next;
        }

        if (current == null) {
            return;
        }
        temp.next = current.next;
    }

    public ListNode addElement(ListNode newNode) {
        if (head == null) {
            return newNode;
        }
        ListNode current = head;
        ListNode temp = null;

        while (current != null && current.data < newNode.data) {
            temp = current;
            current = current.next;
        }
        newNode.next = current;
        if (temp != null) {
            temp.next = newNode;
        } else {
            head = newNode; // In case newNode becomes the new head
        }
        return head;
    }

    public void uniqueSortedList() {
        if (head == null) {
            return;
        }
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
    }

    public ListNode getNthNodeFromEnd(int n) {
        if (head == null || n <= 0) {
            throw new IllegalArgumentException("Invalid value of n: " + n);
        }
        ListNode mainPtr = head;
        ListNode refPtr = head;

        for (int i = 0; i < n; i++) {
            if (refPtr == null) {
                throw new IllegalArgumentException("List size is smaller than " + n);
            }
            refPtr = refPtr.next;
        }
        while (refPtr != null) {
            refPtr = refPtr.next;
            mainPtr = mainPtr.next;
        }
        return mainPtr;
    }

    public ListNode reverse(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode current = head;
        ListNode previous = null;
        ListNode next;

        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }

    public boolean search(int searchKey) {
        ListNode current = head;
        while (current != null) {
            if (current.data == searchKey) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void delete(int position) {
        if (position < 1 || head == null) {
            return;
        }
        if (position == 1) {
            head = head.next;
            return;
        }
        ListNode previous = head;
        int count = 1;
        while (count < position - 1 && previous.next != null) {
            previous = previous.next;
            count++;
        }
        if (previous.next == null) {
            return;
        }
        previous.next = previous.next.next;
    }

    public ListNode deleteFirst() {
        if (head == null) {
            return null;
        }
        ListNode temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }

    public ListNode deleteLast() {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode current = head;
        ListNode previous = null;
        while (current.next != null) {
            previous = current;
            current = current.next;
        }
        previous.next = null;
        return current;
    }

    public void insert(int position, int value) {
        if (position < 1) {
            throw new IllegalArgumentException("Invalid position: " + position);
        }
        ListNode node = new ListNode(value);
        if (position == 1) {
            node.next = head;
            head = node;
            return;
        }
        ListNode previous = head;
        int count = 1;

        while (count < position - 1 && previous != null) {
            previous = previous.next;
            count++;
        }
        if (previous == null) {
            throw new IllegalArgumentException("Position out of bounds");
        }
        node.next = previous.next;
        previous.next = node;
    }

    public void addLinkedList(int value) {
        ListNode listNode = new ListNode(value);
        listNode.next = head;
        head = listNode;
    }

    public void addLast(int value) {
        ListNode listNode = new ListNode(value);
        if (head == null) {
            head = listNode;
            return;
        }
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = listNode;
    }

    public int count() {
        int count = 0;
        ListNode current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public void display() {
        if (loopLinkedList()) {
            System.out.println("Loop detected. Cannot display list.");
            return;
        }
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
