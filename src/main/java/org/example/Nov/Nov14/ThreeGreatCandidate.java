package org.example.Nov.Nov14;

//Given an integer array, find a maximum product of a triplet in the array.
//
//Examples:
//
//Input:  arr[ ] = [10, 3, 5, 6, 20]
//Output: 1200
//Explanation: Multiplication of 10, 6 and 20
//
//Input:  arr[ ] =  [-10, -3, -5, -6, -20]
//Output: -90
//
//Input: arr[ ] =  [1, -4, 3, -6, 7, 0]
//Output: 168

import java.util.Arrays;

public class ThreeGreatCandidate {



    public static void main(String[] args)
    {
        int[] arr = { 1, -4, 3, -6, 7, 0};

        int res = maxProduct(arr);

        System.out.println(res);
        System.out.println(maxProductSorting(arr));
        System.out.println(maxProductGreedyApproach(arr));
    }

    private static int maxProductSorting(int[] arr) {

        Arrays.sort(arr);
        int max = Integer.MIN_VALUE;
        int n = arr.length;
        max = Math.max(arr[n-3]*arr[n-1]*arr[n-2], arr[n-1]*arr[0]*arr[1]);
        return max;
    }

    private static int maxProductGreedyApproach(int[] arr) {

        Arrays.sort(arr);
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max1)
            {
                max3 = max2;
                max2 = max1;
                max1 = arr[i];
            }
            else if (arr[i] < max1 && arr[i] > max2)
            {
                max3 = max2;
                max2 = arr[i];
            }
            else if (arr[i] < max1 && arr[i] < max2 && arr[i] > max3)
            {
                max3 = arr[i];
            }

            //Finging minimun elemets
            if (arr[i] < min1)
            {
                min2 = min1;
                min1 = arr[i];
            }
            else if (arr[i] >min1 && arr[i] < min2)
            {
                min2 = arr[i];
            }

        }
        return Math.max(max1*max2*max3, max1*min2*min1);
    }

    private static int maxProduct(int[] arr) {

        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n-2; i++) {
            for (int j = i+1; j < n-1; j++) {
                for (int k = j+1; k < n; k++) {
                    max = Math.max(max, arr[i]*arr[j]*arr[k]);

                }

            }

        }
        return max;
    }
}
