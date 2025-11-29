package org.example.Nov.Nov29;

//Given two strings s1 and s2 of equal length, consisting only of lowercase English letters, determine if they are isomorphic.
//Two strings are isomorphic if characters in s1 can be replaced to get s2 such that:
//
//Each character in s1 maps to a unique character in s2.
//The mapping is consistent throughout the string.
//The order of characters is preserved.

import java.util.HashMap;
import java.util.Map;

public class IsomorphicString {
    public static void main(String[] args) {
        String s1 = "aab";
        String s2 = "xxy";
        if (areIsomorphic(s1, s2)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    private static boolean areIsomorphic(String s1, String s2) {
        Map<Character, Integer> m1 = new HashMap<>();
        Map<Character, Integer> m2 = new HashMap<>();

        for (int i = 0; i < s1.length(); ++i) {
            // If character not seen before, store its
            // first occurrence index
            if (!m1.containsKey(s1.charAt(i))) {
                m1.put(s1.charAt(i), i);
            }
            if (!m2.containsKey(s2.charAt(i))) {
                m2.put(s2.charAt(i), i);
            }
            System.out.println(m1.get(s1.charAt(i)));
            System.out.println(m2.get(s2.charAt(i)));
            if (!m1.get(s1.charAt(i)).equals(m2.get(s2.charAt(i)))){
                return false;
            }

        }
        return true;
    }

}
