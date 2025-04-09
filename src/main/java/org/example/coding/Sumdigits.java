package org.example.coding;


//Given a number n. Find the sum of all the digits of n.
//
//        Examples:
//
//Input: n = 12
//Output: 3
//Explanation: Sum of 12's digits: 1 + 2 = 3
//Input: n = 23
//Output 5
//Explanation: Sum of 23's digits: 2 + 3 = 5
//Constraints:
//        1<= n <=105

public class Sumdigits {

    public static void main(String[] args) {

        int n = 2341;
        int rem =0, sum=0;
        while(n>0) {
            sum += n % 10;
//            sum += rem;
            n = n/10;
        }
        System.out.println(sum);
    }
}
