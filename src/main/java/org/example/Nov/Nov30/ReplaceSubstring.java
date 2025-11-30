package org.example.Nov.Nov30;

public class ReplaceSubstring {

    public static void main(String[] args) {
        String s = "abababa", s1 = "aba", s2 = "a";
        System.out.println(replaceSubstr(s, s1, s2));
    }

    private static String replaceSubstr(String s, String s1, String s2) {
        return s.replace(s1,s2);
    }
}
