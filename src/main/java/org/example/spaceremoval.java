package org.example;

public class spaceremoval {
    public static void main(String[] args) {
        String str = new String("The boy is gone");
        StringBuilder output = new StringBuilder();
        char [] input = str.toCharArray();

        for (char c: input)
        {
            if (!Character.isWhitespace(c))
            {
                output.append(c);
            }
        }
        System.out.println(output.toString());
    }
}
