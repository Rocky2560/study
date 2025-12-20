package org.example.Dec.Dec20;

//Given an array of integers arr[] and an integer k, find the maximum possible sum among all contiguous subarrays of size exactly k.
//A subarray is a sequence of consecutive elements from the original array. Return the maximum sum that can be obtained from any such subarray of length k.
//
//Examples:
//
//Input  : arr[] = [100, 200, 300, 400],  k = 2
//Output : 700
//Explanation: We get maximum sum by adding subarray [300,400] of size 2
//
//Input  : arr[] = [1, 4, 2, 10, 23, 3, 1, 0, 20], k = 4
//Output : 39
//Explanation: We get maximum sum by adding subarray [4, 2, 10, 23] of size 4.
//
//Input  : arr[] = [2, 3], k = 1
//Output : 3
//Explanation: The subarrays of size 1 are [2] and [3]. The maximum sum is 3.

public class MaxSubArray {

    public static int maxSubarraySum(int[] arr, int k)
    {
        int n = arr.length;
        if (n < k) return -1;
        int currntsum =0;
        for (int i = 0; i < k; i++) {
            currntsum += arr[i];
        }
        int maxSum = currntsum;

        for (int i = k; i < n; i++) {
            currntsum += arr[i] - arr[i-k];
            maxSum = Math.max(maxSum, currntsum);
        }
        return maxSum;

    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        System.out.println(maxSubarraySum(arr, k));
    }
}
