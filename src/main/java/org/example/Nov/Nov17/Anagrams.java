package org.example.Nov.Nov17;

//Given two non-empty strings s1 and s2 of lowercase letters, determine if they are anagrams — i.e., if they contain the same characters with the same frequencies.
//
//Examples:
//
//Input: s1 = “geeks”  s2 = “kseeg”
//Output: true
//Explanation: Both the string have same characters with same frequency. So, they are anagrams.
//
//Input: s1 = "allergy", s2 = "allergyy"
//Output: false
//Explanation: Although the characters are mostly the same, s2 contains an extra 'y' character. Since the frequency of characters differs, the strings are not anagrams.
//
//Input: s1 = "listen", s2 = "lists"
//Output: false
//Explanation: The characters in the two strings are not the same — some are missing or extra. So, they are not anagrams.

public class Anagrams {

    public static void main(String[] args) {

        String s1 = "geeks";
        String s2 = "kseeg";

        if (areAnagrams(s1, s2))
            System.out.println("true");
        else
            System.out.println("false");
    }

    private static boolean areAnagrams(String s1, String s2) {

        if (s1.length() != s2.length()) return false;
        int[] chars = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            chars[s1.charAt(i) - 'a']++;
            chars[s2.charAt(i) - 'a']--;
        }
        for (int i:chars) {
            if (i != 0) return false;
        }
        return true;
    }
}
