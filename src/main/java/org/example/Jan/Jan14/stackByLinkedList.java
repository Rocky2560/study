package org.example.Jan.Jan14;

//https://www.geeksforgeeks.org/dsa/implement-a-stack-using-singly-linked-list/
public class stackByLinkedList {
    // Node structure
    static class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }

    // Stack implementation using linked list
    static class myStack {
        Node top;
        // To Store current size of stack
        int count;

        myStack() {
            // initially stack is empty
            top = null;
            count = 0;
        }

        public void push(int i) {
            Node temp = new  Node(i);
            temp.next = top;
            top = temp;
            count++;
        }

        public int pop() {
            if (top == null) {
                System.out.println("Stack Underflow");
                return -1;
            }
            Node temp = top;
            top = top.next;
            int val = temp.data;
            count--;
            return val;
        }

        public int peek() {
            if (top == null) {
                System.out.println("Stack is Empty");
                return -1;
            }
            return top.data;
        }

        public boolean isEmpty() {
            return top == null;
        }

        public int size() {
            return count;
        }
    }

    public static void main(String[] args) {
        myStack st = new myStack();

        // pushing elements
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        // popping one element
        System.out.println("Popped: " + st.pop());

        // checking top element
        System.out.println("Top element: " + st.peek());

        // checking if stack is empty
        System.out.println("Is stack empty: " + (st.isEmpty() ? "Yes" : "No"));

        // checking current size
        System.out.println("Current size: " + st.size());
    }
    }
