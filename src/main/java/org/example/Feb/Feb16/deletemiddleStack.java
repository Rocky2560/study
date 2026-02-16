package org.example.Feb.Feb16;

import java.util.Stack;

public class deletemiddleStack {
    public static void deleteMid(Stack<Integer> st) {
        int n = st.size();
        Stack<Integer> tempSt = new Stack<>();
        int count = 0;

        while (count < n / 2) {
            int c = st.pop();
            tempSt.push(c);
            count++;
        }

        st.pop();

        while (!tempSt.isEmpty()) {
            st.push(tempSt.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        deleteMid(st);

        while (!st.isEmpty()) {
            int p = st.pop();
            System.out.print(p + " ");
        }
    }
}
