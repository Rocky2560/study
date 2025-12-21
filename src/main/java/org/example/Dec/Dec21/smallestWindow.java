package org.example.Dec.Dec21;

//Given a string S of size N consisting of the characters 0, 1 and 2, the task is to find the length of the smallest substring of string S that contains all the three characters 0, 1 and 2. If no such substring exists, then return -1.
//
//Examples:
//
//Input: S = "01212"
//Output: 3
//Explanation: The substring 012 is the smallest substring that contains the characters 0, 1 and 2.
//
//Input:  S = "12121"
//Output: -1
//Explanation:  As the character 0 is not present in the string S, therefore no substring containing all the three characters 0, 1 and 2 exists. Hence, the answer is -1 in this case.

public class smallestWindow {
    // Function to find the length of the smallest substring
    public static int smallestSubstring(String S)
    {
        int res = Integer.MAX_VALUE;

        // To check 0, 1 and 2
        boolean zero = false, one = false, two = false;

        // To store indexes of 0, 1 and 2
        int zeroindex = 0, oneindex = 0, twoindex = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '0') {
                zero = true;
                zeroindex = i;
            }
            else if (S.charAt(i) == '1') {
                one = true;
                oneindex = i;
            }
            else if (S.charAt(i) == '2') {
                two = true;
                twoindex = i;
            }

            // Calculating length
            if (zero && one && two)
                res = Math.min( res,
                        Math.max(zeroindex,Math.max(oneindex, twoindex))
                                - Math.min( zeroindex,Math.min(oneindex, twoindex)));
        }

        // In case if there is no substring that contains 0,1 and 2
        if (res == Integer.MAX_VALUE)
            return -1;
        return res + 1;
    }

    // Driver Code
    public static void main(String[] args)
    {
        String S = "01212";
        // Function call
        System.out.print(smallestSubstring(S));
    }

}
