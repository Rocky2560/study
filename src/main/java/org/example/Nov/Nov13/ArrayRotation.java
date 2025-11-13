package org.example.Nov.Nov13;

public class ArrayRotation {
//    Given an array of integers arr[] of size n, the task is to rotate the array elements to the left by d positions.
//
//Examples:
//
//Input: arr[] = {1, 2, 3, 4, 5, 6}, d = 2
//Output: {3, 4, 5, 6, 1, 2}
//Explanation: After first left rotation, arr[] becomes {2, 3, 4, 5, 6, 1} and after the second rotation, arr[] becomes {3, 4, 5, 6, 1, 2}
//
//Input: arr[] = {1, 2, 3}, d = 4
//Output: {2, 3, 1}
//Explanation: The array is rotated as follows:
//
//After first left rotation, arr[] = {2, 3, 1}
//After second left rotation, arr[] = {3, 1, 2}
//After third left rotation, arr[] = {1, 2, 3}
//After fourth left rotation, arr[] = {2, 3, 1}


    public static void main(String[] args) {
        int[] arr = { 1, 2, 3};
        int d = 7;

        rotateArr(arr, d);

        // Print the rotated array
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    private static void rotateArr(int[] arr, int d) {

        int n = arr.length;
        d %= n;
        reverseArray(arr, 0, d-1);
        reverseArray(arr, d, n-1);
        reverseArray(arr, 0, n-1);

    }
    public static void reverseArray(int[] arr, int start, int end)
    {
        while (start < end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
