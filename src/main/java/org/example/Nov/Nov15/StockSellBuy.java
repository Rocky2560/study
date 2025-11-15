package org.example.Nov.Nov15;

//
//Stock Buy and Sell - Max one Transaction Allowed
//Last Updated : 05 Sep, 2024
//Given an array prices[] of length N, representing the prices of the stocks on different days, the task is to find the maximum profit possible by buying and selling the stocks on different days when at most one transaction is allowed. Here one transaction means 1 buy + 1 Sell.
//
//        Note: Stock must be bought before being sold.
//
//        Examples:
//
//Input: prices[] = {7, 10, 1, 3, 6, 9, 2}
//Output: 8
//Explanation: Buy for price 1 and sell for price 9.
//
//Input: prices[] = {7, 6, 4, 3, 1}
//Output: 0
//Explanation: Since the array is sorted in decreasing order, 0 profit can be made without making any transaction.
//
//Input: prices[] = {1, 3, 6, 9, 11}
//Output: 10
//Explanation: Since the array is sorted in increasing order, we can make maximum profit by buying at price[0] and selling at price[n-1]
////
public class StockSellBuy {

    public static void main(String[] args) {
        int[] prices = {7, 10, 1, 3, 6, 9, 2};
        System.out.println(maxProfit(prices));
        System.out.println(maxProfitExpected(prices));
    }

    private static int maxProfitExpected(int[] prices) {

        int n = prices.length;
        int min = prices[0], res =0;
        for (int i = 0; i < n-1; i++) {
            min = Math.min(min, prices[i]);

            res = Math.max(res, prices[i] - min);

        }
        return res;
    }

    public static int maxProfit(int [] a)
    {
        int n = a.length;
        int res =0;

        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                res = Math.max(res, a[j] - a[i]);
            }
        }
        return res;
    }


}
