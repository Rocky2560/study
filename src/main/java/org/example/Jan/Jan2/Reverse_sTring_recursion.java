package org.example.Jan.Jan2;
//Given a string, the task is to print the given string in reverse order using recursion.
//
//Examples:
//
//Input: s = "Geeks for Geeks"
//Output: "skeeG rof skeeG"
//Explanation: After reversing the input string we get "skeeG rof skeeG".
//
//Input: s = "Reverse a string Using Recursion"
//Output: "noisruceR gnisU gnirts a esreveR"
//Explanation: After reversing the input string we get "noisruceR gnisU gnirts a esreveR".

public class Reverse_sTring_recursion {


    public static void main(String[] args) {
        String str = "Geeks for pidus";
        System.out.println(reverse(str));
    }

    public static String reverse(String str) {
    if (str.isEmpty()) return str;
    return reverse(str.substring(1))+ str.charAt(0);
    }
}

//Approach - 1] - Make a Recursive Call and Then Process the First Char
//The idea for this approach is to make a recursive call for the substring starting
// from the second character and then print the first character.
