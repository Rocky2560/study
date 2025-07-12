package org.example.DSA;

public class stack_array_implementation {

    private int [] stack;
    private int top;
    private int capacity;

    public stack_array_implementation(int size)
    {
    top = -1;
    capacity = size;
    stack = new int[capacity];
    }

    public void push(int n)
    {
     if (top >= capacity - 1)
     {
         System.out.println("Stack is full");
     }
     stack[++top] = n;
    }

    public int pop()
    {
        if(isEmpty())
        {
            return -1;
        }
        return stack[top--];
    }

    public int peek()
    {
        if (isEmpty())
        {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];
    }

    public boolean isEmpty()
    {
        return top == -1;
    }

    public static void main(String[] args) {
        stack_array_implementation stackArrayImplementation = new stack_array_implementation(5);
        stackArrayImplementation.push(10);


    }
}
