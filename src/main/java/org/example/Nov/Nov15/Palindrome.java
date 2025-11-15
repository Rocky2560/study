package org.example.Nov.Nov15;

//Given a string s, the task is to check if it is palindrome or not.
//
//Example:
//
//Input: s = "abba"
//Output: 1
//Explanation: s is a palindrome
//
//Input: s = "abc"
//Output: 0
//Explanation: s is not a palindrome

public class Palindrome {

    public static void main(String[] args) {
        String s = "abba";
        System.out.println(isPalindrome(s));
    }

    private static boolean isPalindrome(String s) {
        int left =0;
        int right = s.length()-1;
        while (left < right)
        {
            if (s.charAt(left) != s.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
