package org.example.geeks;

import java.util.Arrays;

public class closetSum {
    public static int minAbsSumPair(int[] a)
    {
    int res = a[0] + a[1];
    int n = a.length;
    for (int i=0; i<n; i++)
    {
        for (int j=i+1; j<n; j++)
        {
            int max = a[i] + a[j];
            if (Math.abs(max) <  Math.abs(res))
            {
                res = max;
            }
        }
    }
    return res;
    }


    public static int binarySearch(int [] a)
    {
        Arrays.sort(a);
        int n = a.length;

        int res = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int x = a[i];

            int left = i + 1, right = n-1;

            while (left <= right)
            {
                int mid = (left + right)/2;
                int curr = a[mid] + x;

            }


        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 60, -10, 70, -80, 85 };
        System.out.println(minAbsSumPair(arr));
    }
}
