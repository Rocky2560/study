package org.example.Array.Level2;

import java.util.ArrayList;
import java.util.Arrays;

public class subsetarray {
    //Naive Approach Nested loops
    static boolean isSubset(int[] arr1, int [] arr2, int m , int n)
    {
        for (int i=0; i<n; i++)
        {
            boolean found = false;
            for (int j = 0; j < m; j++) {
                if (arr2[i] == arr1[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) return false;

        }
        return true;
    }

    //using soritng and two pointers;

    static boolean isSubsets(int [] arr1, int [] arr2, int m, int n)
    {
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i=0, j=0;

        while (i < arr1.length && j < arr2.length)
        {
            if (arr1[i] < arr2[j])
            {
                i++;
            } else if (arr1[i] == arr2[j]) {
                i++;
                j++;
            }
            else
            {
                return false;
            }
        }
        return (j == arr2.length);
    }


    public static void main(String[] args) {
        int[] arr1 = {11, 1, 13, 21, 3, 7};
        int[] arr2 = {11, 3, 7, 1};
        int m = arr1.length;
        int n = arr2.length;

        if (isSubset(arr1, arr2, m, n))
            System.out.println("yes");
        else
            System.out.println("No");

        if (isSubsets(arr1, arr2, m, n))
            System.out.println("yes");
        else
            System.out.println("No");
    }
}
