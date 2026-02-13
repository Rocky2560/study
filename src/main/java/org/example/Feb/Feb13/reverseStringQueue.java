package org.example.Feb.Feb13;

import java.util.Stack;

public class reverseStringQueue {

    public static String reverseStringbyStack(String s)
    {
        Stack<Character> stack = new Stack<>();
        String op ="";
        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }
        for (int i = 0; i < s.length(); i++) {
            op += stack.pop();
        }
        return op;
    }

    public static void main(String[] args) {
        String s = "sudip";
        System.out.println(reverseStringbyStack(s));
    }
}
