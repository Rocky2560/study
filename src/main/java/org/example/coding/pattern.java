package org.example.coding;
//Print number pattern
//        Difficulty: BasicAccuracy: 25.17%Submissions: 157K+Points: 1
//        You are given a number n. You need to generate and print a pattern based on the given value of n.
//
//        For each row, starting from the first, print numbers in descending order from n down to 1.
//        Each number in a row is repeated as many times as the current row index (starting from n).
//        Instead of printing each row on a new line, separate rows with -1.
//        Instead of a newline at the end of each row, print -1 to indicate row separation. After printing the entire pattern, end the output with -1.
//
//        For n= 3,
//        pattern:  3 3 3 2 2 2 1 1 1
//        3 3 2 2 1 1
//        3 2 1
//
//        For n= 2,
//        pattern:  2 2 1 1
//        2 1
//
//        Examples :
//
//        Input: 2
//        Output: [2, 2, 1, 1, -1, 2, 1, -1]
//        Input: 3
//        Output: [3, 3, 3, 2, 2, 2, 1, 1, 1, -1, 3, 3, 2, 2, 1, 1, -1, 3, 2, 1, -1]
//        Input: 1
//        Output: [1, -1]
//        Constraints:
//        1 <= n <= 40

import java.util.ArrayList;

public class pattern {

    public static void main(String[] args) {
        int n = 3;
        ArrayList<Integer> result = new ArrayList<>();
        for (int i=0; i<n; i++) {
            for (int j = n; j > 0; j--) {
                for (int k=0; k < n-i; k++)
                {
                    // System.out.print(i + " ");
                    result.add(j);
                }
            }
            result.add(-1);
        }
        // System.out.println(result)

        System.out.println(result);
    }
}
