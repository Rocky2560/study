package org.example.problems;

import java.util.Arrays;

public class count1s {

    static int countOne(int [] a, int l, int r)
    {
        int count =0;
        while (l<r)
        {
            int mid = l + (r-l)/2;
            if (a[mid] == 1 || mid == r || a[mid+1] == 1)
            {
                return mid+1;
            }

            if (a[mid] == 1)
                return countOne(a, mid+1,r);

            return countOne(a, l, mid-1);
        }
        return 0;
    }

    public static void main(String[] args) {
        int a [] = { 1, 1, 1, 1, 0, 0, 0 };
        int n = a.length;

        long output = Arrays.stream(a).filter(i -> i == 1).count();
        System.out.println("Count of 1's in binary number is "+ output);
        System.out.println("Count of 1's in binary number is "+ countOne(a,0,n-1));
    }
}
