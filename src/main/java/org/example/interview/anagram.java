package org.example.interview;

import java.util.Arrays;

public class anagram {

    public static boolean isAnagram(String str1, String str2)
    {
        str1 = str1.replaceAll("\\s","").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        if (str1.length() != str2.length())
        {
            return false;
        }

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr2,arr1);

    }

    public static void main(String[] args) {
        System.out.println(isAnagram("listens", "silent")); // true
        System.out.println(isAnagram("hello", "world"));   // false

    }
}
