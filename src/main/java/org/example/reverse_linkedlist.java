package org.example;

import java.util.LinkedList;

public class reverse_linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> input = new LinkedList<Integer>();
        input.add(1);
        input.add(2);
        input.add(3);

        System.out.println(input);

        System.out.println(input.reversed());
        LinkedList<Integer> output = new LinkedList<Integer>();
        input.descendingIterator().forEachRemaining(output::add);
        System.out.println(output);
    }
}
