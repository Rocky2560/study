package org.example.Jan.Jan3;

//Given a string calculate length of the string using recursion.
//
//Examples:
//
//Input: str = "abcd"
//Output: 4
//Explanation: The string "abcd" has a length of 4.
//
//Input: str = "GEEKSFORGEEKS"
//Output: 13

public class LengthofString_Recursion {

    /* Driver program to test above function */
    public static void main(String[] args)
    {
        String str = "GeeksforGeeks";
        System.out.println(recLen(str));
    }

    private static int recLen(String str) {
        if (str.equals("")) return 0;
        else return recLen(str.substring(1))+1;
    }
}


//Approach:
//If the string is empty (""), the function returns 0 since there are no characters left to count. Otherwise,
// the first character is removed using substring(1), reducing the string size by one. The function then recursively
// calls itself on the remaining substring. With each recursive call, 1 is added to the result to account for
// the removed character. This process continues until the string becomes empty, at which point the recursion stops.