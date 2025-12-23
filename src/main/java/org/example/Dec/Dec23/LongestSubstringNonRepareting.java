package org.example.Dec.Dec23;
//Given a string s having lowercase characters, find the length of the longest substring without repeating characters.
//
//Examples:
//
//Input: s = "geeksforgeeks"
//Output: 7
//Explanation: The longest substrings without repeating characters are "eksforg” and "ksforge", with lengths of 7.
//
//Input: s = "aaa"
//Output: 1
//Explanation: The longest substring without repeating characters is "a"
//
//Input: s = "abcdefabcbb"
//Output: 6
//Explanation: The longest substring without repeating characters is "abcdef".

public class LongestSubstringNonRepareting {
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        System.out.println(longestUniqueSubstr(s));
    }

    private static int longestUniqueSubstr(String s) {
        int left =0, right=0, n=s.length();
        int res =0;
        boolean[] vis = new boolean[26];
        while (right < s.length()) {

            // If character is repeated, move left pointer marking
            // visited characters as false until the repeating
            // character is no longer part of the current window
            while (vis[s.charAt(right) - 'a'] == true) {
                vis[s.charAt(left) - 'a'] = false;
                left++;
            }

            vis[s.charAt(right) - 'a'] = true;

            // The length of the current window (right - left + 1)
            // is calculated and answer is updated accordingly.
            res = Math.max(res, (right - left + 1));
            right++;
        }
        return res;
    }
}
