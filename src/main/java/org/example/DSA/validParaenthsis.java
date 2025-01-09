package org.example.DSA;

import java.util.Stack;

public class validParaenthsis {
    public static void main(String[] args) {
        String s = "{}";
        Stack <Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (char c: chars)
        {
            if (c == '(' || c == '{' || c == '[')
            {
                stack.push(c);
            }
            else
            {
                if(stack.isEmpty()) {
                    System.out.println("not correct order");
                }
                else
                {
                    char top = stack.peek();
                    if (c == ')' && top == '(' ||
                    c == '}' && top == '{' ||
                    c == ']' && top == '[')
                    {
                        stack.pop();
                    }
                        else
                    {
                        System.out.println("not correct order");
                    }
                }

            }

        }
    }
}
