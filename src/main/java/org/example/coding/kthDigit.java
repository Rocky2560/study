package org.example.coding;

//Given two numbers a and b, find kth digit from right of ab.
//
//Example 1:
//
//Input: a = 3, b = 3, k = 1
//Output: 7
//Explanation: 33 = 27 and 1st digit from right is 7
//Input: a = 5, b = 2, k = 2
//Output: 2
//Explanation: 52 = 25 and second digit from right is 2.
//Constraints:
//        1 <= a,b <= 15
//        1 <= k <= digits in ab

public class kthDigit {

    public static void main(String[] args) {
        double a =52, b=2, k=4;
        double sum =0;
        double res = Math.pow(a, b);
        System.out.println(res);
        while (k > 0)
        {
          sum = res%10;
          res /= 10;
          k--;
        }
        System.out.println((int)sum);

    }
}
