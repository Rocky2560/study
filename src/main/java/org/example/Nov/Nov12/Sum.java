package org.example.Nov.Nov12;

public class Sum {
//    Given a positive number n. Find the sum of all the digits of n.
//
//            Examples:
//
//    Input: n = 687
//    Output: 21
//    Explanation: Sum of 687's digits: 6 + 8 + 7 = 21
//    Input: n = 12
//    Output 3
//    Explanation: Sum of 12's digits: 1 + 2 = 3
//    Constraints:
//            1 <= n <= 105

    public static void main(String[] args) {
        int n = 687, x = 687;
        int sum = 0, div = 0, rev = 0, num = 0, sum1 = 0;
        while (n > 0) {
            div = n % 10;
            sum += div;
            n /= 10;
        }
        System.out.println(sum);


        while (x != 0) {
            int digit = x % 10;   // extract last digit
            rev = rev * 10 + digit; // build reversed number
            x /= 10;               // remove last digit
        }
        System.out.println(rev);


//    Given two numbers a and b, find kth digit from right of ab.
//
//    Example 1:
//
//    Input: a = 3, b = 3, k = 1
//    Output: 7
//    Explanation: 33 = 27 and 1st digit from right is 7
//    Input: a = 5, b = 2, k = 2
//    Output: 2
//    Explanation: 52 = 25 and second digit from right is 2.
//    Constraints:
//            1 <= a,b <= 15
//            1 <= k <= digits in ab
        int a = 5, b=2, k=2;
        int y = (int)( Math.pow(a,b));
        for(int i=1; i<k; i++)
        {
            y /=10;
        }
        int kthDigit = y % 10;

        System.out.println(kthDigit);

        int bin = 111;  // binary number
        int output = 0;
        int base = 1;   // represents 2^0 initially

        while (bin > 0) {
            int lastDigit = bin % 10;
            output += lastDigit * base;
            base *= 2;
            bin /= 10;
        }
        System.out.println(output);
    }



}


