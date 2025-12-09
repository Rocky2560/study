package org.example.Dec.Dec9;

//Given an array arr[] of n integers and an integer target, find the sum of triplets such that the sum is closest to target. Note: If there are multiple sums closest to target, print the maximum one.
//
//Examples:
//
//Input: arr[] = [-1, 2, 2, 4], target = 4
//Output: 5
//Explanation: All possible triplets
//
//[-1, 2, 2], sum = (-1) + 2 + 2 = 3
//[-1, 2, 4], sum = (-1) + 2 + 4 = 5
//[-1, 2, 4], sum = (-1) + 2 + 4 = 5
//[2, 2, 4], sum = 2 + 2 + 4 = 8
//Triplet [-1, 2, 2], [-1, 2, 4] and [-1, 2, 4] have sum closest to target, so return the maximum one, that is 5.
//
//Input: arr[] = [1, 10, 4, 5], target = 10
//Output: 10
//Explanation: All possible triplets
//
//[1, 10, 4], sum = (1 + 10 + 4) = 15
//[1, 10, 5], sum = (1 + 10 + 5) = 16
//[1, 4, 5], sum = (1 + 4 + 5) = 10
//[10, 4, 5], sum = (10 + 4 + 5) = 19
//Triplet [1, 4, 5] has sum = 10 which is closest to target.

import java.util.*;

class Closet3sum {
    static int closest3Sum(int[] arr, int target) {
        int n = arr.length;
        Arrays.sort(arr);
        int res = 0;
        int minDiff = Integer.MAX_VALUE;

        for (int i = 0; i < n - 2; i++) {

            // Initialize the left and right pointers
            int l = i + 1, r = n - 1;

            while (l < r) {
                int currSum = arr[i] + arr[l] + arr[r];

                // If |currSum - target| < minDiff, then we have
                // found a triplet which is closer to target
                if (Math.abs(currSum - target) < minDiff) {
                    minDiff = Math.abs(currSum - target);
                    res = currSum;
                }
                // If multiple sums are closest, take maximum one
                else if(Math.abs(currSum - target) == minDiff) {
                    res = Math.max(res, currSum);
                }

                // If currSum > target then we will decrease the
                // right pointer to move closer to target
                if (currSum > target)
                    r--;

                    // If currSum <= target then we will increase the
                    // left pointer to move closer to target
                else
                    l++;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {-1, 2, 2, 4};
        int target = 4;
        System.out.println(closest3Sum(arr, target));
    }
}
