package org.example.Feb.Feb8;

import java.util.LinkedList;
import java.util.Queue;

//https://www.geeksforgeeks.org/dsa/implement-stack-using-queue/

public class StackfromQueue {
    static class stack
    {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        public int size()
        {
            return q1==null?0:q1.size();
        }

        public int top()
        {
            if (q1.isEmpty())
            {
                return -1;
            }
            return q1.peek();
        }

        public void pop()
        {
            if (q1.isEmpty())
            {
                return;
            }
            q1.remove();
        }

        public void push(int x)
        {
            q2.add(x);
            while (!q1.isEmpty())
            {
                q2.add(q1.peek());
                q1.remove();
            }

            Queue<Integer> t = q1;
            q1 = q2;
            q2 = t;
        }
    }

    static class myStack {
        private Queue<Integer> q = new LinkedList<>();

        // push element on top
        public void push(int x) {
            q.add(x);

            int sz = q.size();
            for (int i = 0; i < sz - 1; i++) {
                q.add(q.peek());
                q.poll();
            }
        }

        // remove top element
        public void pop() {
            if (!q.isEmpty())
                q.poll();
        }

        // return top element
        public int top() {
            if (q.isEmpty())
                return -1;
            return q.peek();
        }

        // return current size
        public int size() {
            return q.size();
        }
    }

    public static void main(String[] args) {
        stack st = new stack();
        st.push(1);
        st.push(2);
        st.push(3);

        System.out.println(st.top());
        st.pop();
        System.out.println(st.top());
        st.pop();
        System.out.println(st.top());

        System.out.println(st.size());

        myStack stt = new myStack();
        stt.push(1);
        stt.push(2);
        stt.push(3);

        System.out.println(stt.top());
        stt.pop();
        System.out.println(stt.top());
        stt.pop();
        System.out.println(stt.top());

        System.out.println(stt.size());

    }
}
