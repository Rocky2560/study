package org.example.Dec.Dec1;

//Given an integer array arr[] and k. Find the k'th smallest element in the given array.
//Note: k is always smaller than the size of the array.
//
//Examples:
//
//Input: arr[] = [10, 5, 4, 3, 48, 6, 2, 33, 53, 10], k = 4
//Output: 5
//Explanation: 4th smallest element in the given array is 5.
//
//Input: arr[] = [7, 10, 4, 3, 20, 15], k = 3
//Output: 7
//Explanation: 3rd smallest element in the given array is 7.

import java.util.Arrays;

public class Kthsmallest {

    public static void main(String[] args) {
        int [] in = {1,2,7,5,3,9,8};
        int k=4;
        Arrays.sort(in);
        System.out.println(in[k-1]);
    }
}
