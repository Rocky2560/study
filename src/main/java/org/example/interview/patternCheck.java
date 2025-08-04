package org.example.interview;

import java.util.Stack;

public class patternCheck {

    public static boolean checkPattern(char[] chars){
        Stack<Character> stack = new Stack<>();
        for (char c: chars)
        {
            if (c == '['  || c == '{' || c == '(' )
            {
                stack.push(c);
            } else if (c == ']'  || c == '}' || c == ')') {
                if (stack.isEmpty())
                {
                    return false;
                }
                char top = stack.peek();
                if (c == '}' && top == '{' || (c == ']' && top == '[') ||
                        (c == ')' && top == '('))
                {
                   stack.pop();
                }
                else
                {
                    return false;
                }

            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "{[}";
        char[] chars = s.toCharArray();
        System.out.println(checkPattern(chars));
    }
}
