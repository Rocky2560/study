package org.example.Jan.Jan5;

//Given an array arr, we need to find the sum of its elements using Tail Recursion Method. We generally want to achieve tail recursion so that compilers can optimize the code. If the recursive call is the last statement, the compiler can optimize it by eliminating the need to store the parent call's state.
//
//Examples:
//
//Input: arr = [1, 8, 9]
//Output: 18
//Explanation: The sum of the elements in the array [1, 8, 9] is 18.
//
//Input: arr = [2, 55, 1, 7]
//Output: 65

public class sumOfArrayRecursion {

    public static void main(String[] args) {
        int arr[] = { 2, 55, 1, 7 };
        int n = arr.length;
        System.out.print(arrSum(arr, n, 0));
    }

    private static int arrSum(int[] arr, int n, int i) {
        if (n == 0) return i;
        return arrSum(arr, n-1, i+arr[n-1]);
    }
}
