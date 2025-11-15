package org.example.Nov.Nov15;

//Given a string s, the task is to reverse the string. Reversing a string means rearranging the characters such that the first character becomes the last, the second character becomes second last and so on.
//
//Examples:
//
//Input: s = "GeeksforGeeks"
//Output: "skeeGrofskeeG"
//Explanation : The first character G moves to last position, the second character e moves to second-last and so on.
//
//Input: s = "abdcfe"
//Output: "efcdba"
//Explanation: The first character a moves to last position, the second character b moves to second-last and so on.
public class ReverseString {

    public static void main(String[] args) {
        String s = "abdcfe";
        String res = reverseString(s);
        String res2 = reverseStringPointer(s);
        System.out.print(res +" "+ res2);
    }

    private static String reverseStringPointer(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);
        int left = 0, right = s.length()-1;
        while(left < right)
        {
            char c = stringBuilder.charAt(left);
            stringBuilder.setCharAt(left, stringBuilder.charAt(right));
            stringBuilder.setCharAt(right, c);
            left++; right--;
        }
        return stringBuilder.toString();
    }

    private static String reverseString(String s) {

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = s.length()-1; i >= 0; i--) {
            stringBuilder.append(s.charAt(i));
        }
        return stringBuilder.toString();
    }
}
