package org.example.Nov.Nov22;

import java.util.HashMap;

public class LongestSubStringCharacter {

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(longestSubString(s));
    }

    private static int longestSubString(String s) {
        int n = s.length();
        int left =0, maxLength=0;
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int right = 0; right <n; right++) {
            char c = s.charAt(right);

            if (hashMap.containsKey(c) && hashMap.get(c) >= left)
            {
                left = hashMap.get(c)+1;
            }

            hashMap.put(c, right);

            int currLength = right-left+1;
            maxLength = Math.max(maxLength, currLength);
        }
        return maxLength;
    }
}
