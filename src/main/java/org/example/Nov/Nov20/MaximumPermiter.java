package org.example.Nov.Nov20;

//Given an array arr[] of positive integers. Find out the maximum perimeter of the triangle from the array.
//
//Note: Return -1, if it is not possible to construct a triangle.
//
//Examples:
//
//Input: arr[] = [6, 1, 6, 5, 8, 4]
//Output: 20
//Explanation: Triangle formed by  8,6 & 6 has perimeter 20, which is the max possible.
//
//Input: arr[] = [7, 55, 20, 1, 4, 33, 12]
//Output:  -1
//Explanation: The triangle is not possible because the condition: the sum of two sides should be greater than third is not fulfilled here.

import java.util.Arrays;

public class MaximumPermiter {

    public static void main(String[] args) {
        int[] arr = {7, 55, 20, 1, 4, 33, 12};
        System.out.println(maxPerimeter(arr));
    }

    private static int maxPerimeter(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        for (int i = 0; i < n/2; i++) {
            int temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;
        }
        for (int i = 0; i < n-2; i++) {
            if (arr[i] < arr[i+1]+arr[i+2]) return arr[i]+arr[i+1]+arr[i+2];
        }
        return -1;
    }
}
