package org.example.leetcode;

public class Anagram {
    public static void main(String[] args) {
        String s = "aad";
        String t = "daa";

        //Checking the size of the strings
        if (s.length() != t.length())
        {
            System.out.println("Thers is no anagram");
        }

        //Creating an array to count character frequencies
        int [] charCount = new int [25];

        //Increment count for each character in 's' and decrement for each in 't'
        for (int i=0; i < s.length(); i++)
        {
            charCount[s.charAt(i) - 'a']++;
            charCount[t.charAt(i) - 'a']--;
        }

        //check if count are zero
        for (int count : charCount)
        {
            if (count != 0)
            {
                System.out.println("There is no anagram");
            }
        }
        System.out.println("The string are anagram");
    }
}
