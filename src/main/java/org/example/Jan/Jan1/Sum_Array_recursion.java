package org.example.Jan.Jan1;

//Given an array of integers, find sum of array elements using recursion.
//
//Examples:
//
//Input: arr = [1, 2, 3]
//Output: 6
//Explanation: 1 + 2 + 3 = 6
//
//Input: arr = [15, 12, 13, 10]
//Output: 50
//Explanation: 15 + 12 + 13 + 10 = 50

public class Sum_Array_recursion {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(arraysum(arr));
    }

    private static int arraysum(int[] arr) {
        return RecSum(arr, arr.length);
    }

    private static int RecSum(int[] arr, int length) {
        if (length <=0) return 0;
        return  RecSum(arr,length-1)+ arr[length-1];
    }
}


//Approach:
//Illustration:
//
//Given A = [1, 2, 3, 4, 5], the problem is solved recursively by breaking it down step by step.
// Each step reduces the array size, summing the last element with the sum of the remaining elements until the base case is reached.