package org.example.Feb.Feb18;

import java.util.Stack;

public class ReverseEachWord {

    public static void main(String[] args) {
        String str = "Geeks for Geeks";
        String reversed = reverseWords(str);
        System.out.println(reversed);
    }

    private static String reverseWords(String str) {
        Stack<Character> stack = new Stack<>();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ')
            {
                stack.push(str.charAt(i));
            }
            else
            {
                while (!stack.isEmpty())
                {
                    stringBuilder.append(stack.pop());
                }
                stringBuilder.append(" ");
            }
        }
        while (!stack.isEmpty())
        {
            stringBuilder.append(stack.pop());
        }
        return stringBuilder.toString();
    }
}
