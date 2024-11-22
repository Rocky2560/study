package org.example;

import java.util.HashMap;
import java.util.Map;

public class counCharacter {
    public static void main(String[] args) {


        String str = "abcdeacbdesfa";

        char[] chars = str.toCharArray();

        Map<Character, Integer> result = new HashMap<Character, Integer>();

        for (char c : chars) {
            if(result.containsKey(c))
            {
                result.put(c,result.get(c)+1);
            }
            else
            {
                result.put(c,1);
            }
        }
        System.out.println(result);
    }
}