package org.example.Nov.Nov20;

//Given an array arr[] of integers and a number x, the task is to find the smallest subarray with a sum strictly greater than x.
//
//Examples:
//
//Input: x = 51, arr[] = [1, 4, 45, 6, 0, 19]
//Output: 3
//Explanation: Minimum length subarray is [4, 45, 6]
//
//Input: x = 100, arr[] = [1, 10, 5, 2, 7]
//Output: 0
//Explanation: No subarray exist

import java.io.Console;

public class SmallestSubArray {

    public static void main(String[] args) {
        int [] arr = {1,4,45,6,0,19};
        int x = 51;
        System.out.println(smallestSubWithSum(x, arr));
    }

    private static int smallestSubWithSum(int x, int[] arr) {
        int i=0, j=0, sum =0;
        int ans = Integer.MAX_VALUE;

        while (j < arr.length)
        {
            while ( j< arr.length && sum <= x)
            {
                sum += arr[j++];
            }

            if (j == arr.length && sum <= x) break;

            while (i < j && sum-arr[i] > x) sum -= arr[i++];

            ans = Math.min(ans, j-i);
            sum -= arr[i];
            i++;
        }
        // Return 0 if no valid subarray
        // found, else return min length
        if (ans == Integer.MAX_VALUE) return 0;
        return ans;
    }
}
