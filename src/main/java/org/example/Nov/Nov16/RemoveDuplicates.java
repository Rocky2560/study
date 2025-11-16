package org.example.Nov.Nov16;
//Given a sorted array arr[] of size n, the goal is to rearrange the array so that all distinct elements appear at the beginning in sorted order. Additionally, return the length of this distinct sorted subarray.
//
//Note: The elements after the distinct ones can be in any order and hold any value, as they don't affect the result.
//
//Examples:
//
//Input: arr[] = [2, 2, 2, 2, 2]
//Output: [2]
//Explanation: All the elements are 2, So only keep one instance of 2.
//
//Input: arr[] = [1, 2, 2, 3, 4, 4, 4, 5, 5]
//Output: [1, 2, 3, 4, 5]
//
//Input: arr[] = [1, 2, 3]
//Output: [1, 2, 3]
//Explanation : No change as all elements are distinct.

import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 4, 5, 5};
        int[] arr1 = {1, 2, 2, 3, 4, 4, 4, 5, 5};
        int newSize = removeDuplicates(arr);

        for (int i = 0; i < newSize; i++) {
            System.out.print(arr[i] + " ");
        }

        int Size = removeDuplicatesExpected(arr1);

        for (int i = 0; i < Size; i++) {
            System.out.println(arr[i] + " ");
        }
}

    private static int removeDuplicates(int[] arr) {
        HashSet<Integer> hashSet = new HashSet<>();
        int n = arr.length;
        int j=0;
        for (int i = 0; i < n; i++) {
          if (!hashSet.contains(arr[i]))
          {
              hashSet.add(arr[i]);
              arr[j++] = arr[i];
          }
        }

        return j;
    }

    private static int removeDuplicatesExpected(int[] arr)
    {
        int n = arr.length;
        if (n <= 1)
            return n;
        int idx =1;
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i-1])
            {
                arr[idx++] = arr[i];
            }

        }
        return idx;
    }
    }
