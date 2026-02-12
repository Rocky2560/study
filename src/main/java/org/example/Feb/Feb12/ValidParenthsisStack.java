package org.example.Feb.Feb12;

import java.util.Stack;

//https://www.geeksforgeeks.org/dsa/check-for-balanced-parentheses-in-an-expression/

public class ValidParenthsisStack {

    public static void main(String[] args) {
        String s = "[()()]{}";
        System.out.println((isBalanced(s) ? "true" : "false"));
    }


    private static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray())
        {
            if (c == '(' || c == '{' || c == '[')
            {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) return false;

                char top = stack.peek();
                if ((c == ')' && top != '(') ||
                        (c == '}' && top != '{') ||
                        (c == ']' && top != '[')) {
                    return false;
                }
                stack.pop();
                
            }
        }
        return stack.isEmpty();
    }
}
