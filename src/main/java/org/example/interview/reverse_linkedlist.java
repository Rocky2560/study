package org.example.interview;

import java.util.LinkedList;

public class reverse_linkedlist {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(6);
        LinkedList<Integer> op = new LinkedList<>();

        linkedList.descendingIterator().forEachRemaining(op::add);
        System.out.println(op);
    }
}
