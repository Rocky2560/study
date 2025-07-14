package org.example.interview;

public class comonPrefix {

    public static String  longestCommonPrefix(String[] strs)
    {
        if (strs == null || strs.length == 0)
        {
            return "";
        }
//
//        for (int i=0 ; i < in[0].length(); i++)
//        {
//            char c = in[0].charAt(i);
//            for (int j=i; j<in.length; j++)
//            {
//                if (i >= in[j].length() || in[j].charAt(i) != c)
//                    return in[0].substring(0,i);
//            }
//        }
//        return in[0];

        String prefix = strs[0]; // Initialize prefix with the first string in the array
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1); // Reduce prefix length until it matches
                if (prefix.isEmpty()) {
                    return ""; // If prefix becomes empty, return an empty string
                }
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        String[] input = {"flower", "flow", "flight"};
        System.out.println("Longest Common Prefix: " + longestCommonPrefix(input));
    }
}
