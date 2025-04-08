package org.example.coding;


//Given two integers a and r i,e first term and common ratio of a GP series. Find the nth term of the series.
//        Note: As the answer can be rather large, print its modulo of 1000000007 (109 + 7).
//
//Examples:
//
//Input: a = 2, r = 2, n = 4
//Output: 16
//Explanation: The GP series is 2, 4, 8, 16, 32,... in which 16 is the 4th term.
//Input: a = 4, r = 3, n = 3
//Output: 36
//Explanation: The GP series is 4, 12, 36, 108,.. in which 36 is the 3rd term.
//Constraints:
//        1 <= a, r, n <= 1000000


public class seriesGp {

    public static void main(String[] args) {


        int a = 4, r = 3, n = 3;
        int result = a;
        while (n > 1) {
            result *= r;
            n--;
        }
        System.out.println( result);
    }
}