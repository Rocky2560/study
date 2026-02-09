package org.example.Feb.Feb9;

import java.util.Stack;

//https://www.geeksforgeeks.org/dsa/queue-using-stacks/
public class queueFromStack {

    static class myQueeue
    {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        public void enqueue(int x)
        {
           while (!stack1.isEmpty())
           {
               stack2.push(stack1.pop());
           }

           stack1.push((x));

           while (!stack2.isEmpty())
           {
               stack1.push(stack2.pop());
           }
        }
        // Dequeue operation
        void dequeue() {
            if (stack1.isEmpty()) {

                // Queue underflow
                return;
            }
            stack1.pop();
        }

        // Front operation
        int front() {
            if (stack1.isEmpty()) {

                // Queue empty
                return -1;
            }
            return stack1.peek();
        }

        // Size operation
        int size() {
            return stack1.size();
        }

    }
    public static void main(String[] args) {
        myQueeue q = new myQueeue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);

        System.out.println("Front: " + q.front());
        System.out.println("Size: " + q.size());

        q.dequeue();

        System.out.println("Front: " + q.front());
        System.out.println("Size: " + q.size());
    }
}
