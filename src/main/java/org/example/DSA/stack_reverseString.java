package org.example.DSA;
import java.util.Stack;
public class stack_reverseString {

    public static void main(String[] args) {
        String in = "sudip";
        Stack<Character> stack = new Stack<>();
        char[] chars = in.toCharArray();
        for (char c: chars)
        {
            stack.push(c);
        }

        for (int i=0; i<in.length(); i++)
        {
            chars[i] = stack.pop();
        }
        String op = new String (chars);
        System.out.println(op);
    }
}
