package org.example.Dec.Dec8;

//Given an array arr[] and an integer sum, check if there is a triplet in the array which sums up to the given target sum.
//
//Examples:
//
//Input: arr[] = [1, 4, 45, 6, 10, 8], target = 13
//Output: true
//Explanation: The triplet [1, 4, 8] sums up to 13
//
//Input: arr[] = [1, 2, 4, 3, 6, 7], target = 10
//Output: true
//Explanation: The triplets [1, 3, 6] and [1, 2, 7] both sum to 10.
//
//Input: arr[] = [40, 20, 10, 3, 6, 7], sum = 24
//Output: false
//Explanation:  No triplet in the array sums to 24.

import java.util.HashSet;

public class ThreeSum {

    public static void main(String[] args) {
        int[] arr = { 1, 4, 45, 6, 10, 8 };
        int target = 13;
        if (hasTripletSum(arr, target))
            System.out.println("true");
        else
            System.out.println("false");
    }

    private static boolean hasTripletSum(int[] arr, int target) {
        HashSet<Integer> hashSet = new HashSet<>();
        int n = arr.length;
        for (int i = 0; i < n-2; i++) {
            for (int j = i+1; j < n; j++) {
                int sum = target-arr[i]-arr[j];

                if (hashSet.contains(sum)){ return true;}
                hashSet.add(arr[j]);

            }
        }
        return false;
    }
}
