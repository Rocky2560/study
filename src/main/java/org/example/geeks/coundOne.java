package org.example.geeks;

import java.util.Arrays;

public class coundOne {

    public static int count(int [] a)
    {
        int n = a.length;
        int count = 0;
        for (int i = 0; i <n ; i++) {
            for(int j=1; j<n; j++)
            {
                if (a[i] == a[j])
                {
                    count++;
                }
                else
                {
                    return count;
                }
            }
        }
        return count;
    }

    //BinarySearch by recursive way
    public static int binarySearch(int[] a, int low, int high) {
        if (low <= high) {
            int mid = low + (high - low)/ 2;
            if (mid == high  || a[mid + 1] == 0 && a[mid] == 1) {
                return mid + 1;
            }
            if (a[mid] == 1)
                return binarySearch(a, mid+1, high);

            return binarySearch(a, low, mid-1);
        }
        return 0;
    }

    public static int binaryIterative(int [] a, int low, int high)
    {
    while (low <= high)
    {
        int mid = low + (high - low)/2;
        if (mid == high || a[mid+1] == 0 && a[mid] == 1)
        {
            return mid+1;

        } else if (mid == 1) {
            low = mid+1;
        }
        else
        {
            high = mid-1;
        }
    }
    return 0;
    }

    public static void streamWay(int[] a)
    {
        long total = Arrays.stream(a).filter(i -> i==1).count();
        System.out.println("the count's of 1 is "+ total);
    }

    public static void main(String[] args) {
        int [] a = {1, 1, 0, 0, 0, 0, 0};
        int count = count(a) + 1;
        System.out.println("Couht of 1's1s "+count);
        int bs = binarySearch(a, 0, a.length-1);
        System.out.println("Couht of 1's1s "+bs);

        int bss = binaryIterative(a, 0, a.length-1);
        System.out.println("Couht of 1's1s "+ bss);

        streamWay(a);
    }
}
