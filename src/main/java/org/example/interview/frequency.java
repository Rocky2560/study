package org.example.interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class frequency {
    public static void main(String[] args) {
        String a = "banana";
        HashMap<Character,Integer> hashMap = new HashMap<>();
        for (int i=0 ; i<a.length(); i++)
        {
            char ch = a.charAt(i);
            if (hashMap.containsKey(ch))
            {
            hashMap.put(ch, hashMap.get(ch)+1);
            }
            else {
                hashMap.put(ch, 1);
            }
        }
        char [] chars = a.toCharArray();
        HashSet<Character> hashSet = new HashSet<>();
        for (char ch: chars) {
            hashSet.add(ch);
        }
        System.out.println(hashSet);

        System.out.println(hashMap);

    }
}
