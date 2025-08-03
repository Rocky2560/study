package org.example.interview;

import java.util.Scanner;

public class spcae_removal {

    public static void main(String[] args) {
        StringBuilder st = new StringBuilder();
        String in = "this is the world";
        String s = "  abc  def\t";
        s = s.strip();
        System.out.println(s);
        char[] ch = in.toCharArray();
        for (char x: ch)
        {
            if (!Character.isWhitespace(x))
            {
                st.append(x);
            }
        }
        System.out.println(st.toString());
    }
}
