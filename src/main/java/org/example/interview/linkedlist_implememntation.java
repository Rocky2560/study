package org.example.interview;

import java.util.LinkedList;

public class linkedlist_implememntation {

    private LinkedList<Integer> stack;
    private int top;
    private int capacity;



    public boolean isEmpty()
    {
        return top == -1;
    }

    public void push(int n)
    {
        if (top >= capacity -1)
        {
            System.out.println("stack is overflow");
        }
        stack.add(n);
        top++;
    }

    public int peek()
    {
        if (isEmpty())
        {
            System.out.println("Stack is empty");
        }
        return stack.get(top);
    }
    public int pop()
    {
        if (isEmpty())
        {
            System.out.println("Stack is empty");
        }
        return stack.get(top--);
    }



    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.push(5);
        linkedList.push(6);
        System.out.println(linkedList.pop());





    }
}
