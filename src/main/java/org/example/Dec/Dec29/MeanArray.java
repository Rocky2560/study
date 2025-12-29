package org.example.Dec.Dec29;

import java.util.Arrays;

public class MeanArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(findMean(arr));
    }

    private static double findMean(int[] arr) {

        int n = arr.length;
        if (n == 1)
        {
            return (double)arr[n-1];
        }
        else
        {
            return ((findMean(Arrays.copyOf(arr, n-1)) *  (n-1) + arr[n-1]) / n);
        }

    }


}
