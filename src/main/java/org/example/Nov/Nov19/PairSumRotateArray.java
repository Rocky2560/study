package org.example.Nov.Nov19;

//Given an array arr[] of size n, which is sorted and then rotated around an unknown pivot, the task is to check whether there exists a pair of elements in the array whose sum is equal to a given target value.
//
//Examples :
//
//Input: arr[] = [11, 15, 6, 8, 9, 10], target = 16
//Output: true
//Explanation: There is a pair (6, 10) with sum 16.
//
//Input: arr[] = [11, 11, 15, 26, 38, 9, 10], target = 35
//Output: true
//Explanation: There is a pair (26, 9) with sum 35.
//
//Input: arr[] = [9, 10, 10, 11, 15, 26, 38], target = 45
//Output: false
//Explanation: There is no pair with sum 45.

import java.util.HashSet;

public class PairSumRotateArray {
    static boolean pairInSortedRotated(int[] arr, int target){
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {

            // Calculate the complement that added to
            // arr[i], equals the target
            int complement = target - arr[i];

            // Check if the complement exists in the set
            if (set.contains(complement)) {
                return true;
            }

            // Add the current element to the set
            set.add(arr[i]);
        }

        // If no pair is found
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {11, 15, 6, 8, 9, 10};
        int target = 16;

        if (pairInSortedRotated(arr, target))
            System.out.println("true");
        else
            System.out.println("false");
    }

}
