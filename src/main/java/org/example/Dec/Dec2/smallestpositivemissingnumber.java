package org.example.Dec.Dec2;

//Given an unsorted array arr[] with both positive and negative elements, find the smallest positive number missing from the array.
//
//Examples:
//
//Input: arr[] = [2, -3, 4, 1, 1, 7]
//Output: 3
//Explanation: 3 is the smallest positive number missing from the array.
//
//Input: arr[] = [5, 3, 2, 5, 1]
//Output: 4
//Explanation: 4 is the smallest positive number missing from the array.
//
//Input: arr[] = [-8, 0, -1, -4, -3]
//Output: 1
//Explanation: 1 is the smallest positive number missing from the array.

public class smallestpositivemissingnumber {

    public static void main(String[] args) {
        int[] arr = {2, -3, 4, 1, 1, 7};
        System.out.println(missingNumber(arr));
    }

    private static int missingNumber(int [] arr)
    {
        int n = arr.length;;
        for (int i = 0; i < n; i++) {
            while (arr[i] >= 1 && arr[i] <= n && arr[i] != arr[arr[i] - 1]) {
                int temp = arr[i];
                arr[i] = arr[arr[i] - 1];
                arr[temp - 1] = temp;
            }
        }
        for (int j = 1; j <= n; j++) {
            if (arr[j - 1] != j)
                return j;
        }


        return n+1;
    }
}
