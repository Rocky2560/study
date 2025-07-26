package org.example.interview;

import java.util.Arrays;

/**
 * Given an array prices[] of length N, representing the prices of the stocks on different days,
 * the task is to find the maximum profit possible by buying and selling the stocks on different days
 * when at most one transaction is allowed. Here one transaction means 1 buy + 1 Sell.
 *
 * Note: Stock must be bought before being sold.
 *
 * Examples:
 *
 * Input: prices[] = {7, 10, 1, 3, 6, 9, 2}
 * Output: 8
 * Explanation: Buy for price 1 and sell for price 9.
 *
 * Input: prices[] = {7, 6, 4, 3, 1}
 * Output: 0
 * Explanation: Since the array is sorted in decreasing order, 0 profit can be made without making any transaction.
 *
 * Input: prices[] = {1, 3, 6, 9, 11}
 * Output: 10
 * Explanation: Since the array is sorted in increasing order, we can make maximum profit by buying at price[0]
 * and selling at price[n-1]
 */

public class stockbuysell {

    public static int maxProfit(int [] profit)
    {
        int max = 0;
        for (int i = 0; i < profit.length-1; i++) {
            for (int j = i+1; j < profit.length; j++) {
                max = Math.max(max, profit[j] - profit[i]);
            }
        }
        return max;
    }

    static int approachmaxProfit(int[] prices) {
        int minSoFar = prices[0];
        int res = 0;

        // Update the minimum value seen so far
        // if we see smaller
        for (int i = 1; i < prices.length; i++) {
            minSoFar = Math.min(minSoFar, prices[i]);

            // Update result if we get more profit
            res = Math.max(res, prices[i] - minSoFar);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] prices = {7, 10, 1, 3, 6, 9, 2};
        System.out.println(maxProfit(prices));
        System.out.println(approachmaxProfit(prices));
    }

}
