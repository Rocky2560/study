package org.example.Array.Level1;

import java.util.Arrays;

public class negativepositive {

    //Two pointe Approach
    static void pointer(int [] a)
    {
        int left =0, right = a.length-1;
        while(left <= right)
        {
            if (a[left] <0 && a[right] <0)
                left ++;
            else if (a[left] >0 && a[right] > 0) {
                int temp = a[left];
                a[left] = a[right];
                a[right] = temp;
                left++;
                right--;
            }
            else if (a[left]>0 && a[right]<0)
            {
                right --;
            }
            else
                left++;
                right--;
        }
    }

    static void swap(int a, int b)
    {
        int temp = a;
        a = b;
        b = temp;
    }

    //Quick Sort technique
    static void quickSort(int [] a)
    {
        int j=0;
        for (int i=0; i<a.length; i++)
        {
            if(a[i] < 0)
            {
             if (i!=j)
             {
                 int temp = a[i];
                 a[i] = a[j];
                 a[j] = temp;
             }
             j++;
            }
        }
    }
    //Sorting Method
    static void sort(int [] a)
    {
        Arrays.sort(a);
    }
    // function to shilf all negative integers to the left
    // and all positive integers to the right
    //Dutch National Flag Alorithmn
    static void dutch(int [] a)
    {
        int low=0, high = a.length-1;
        while (low <= high)
        {
            if (a[low] <= 0)
            {
                low++;
            }
            else
            {
                int temp = a[low];
                a[low] = a[high];
                a[high] = temp;
                high--;
            }
        }

    }
    static void print(int [] a)
    {
        for (int x: a)
        {
            System.out.print(x + " ");

    }
    }
    public static void main(String[] args) {
        int[] arr = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
        int[] a = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
        int[] b = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
        int[] ar = { 1, 2,  -4, -5, 2, -7, 3,
                2, -6, -8, -9, 3, 2,  1 };
        sort(arr);
        print(arr);

        System.out.println();
        quickSort(a);
        print(a);

        System.out.println();
        pointer(a);
        print(a);

        System.out.println();
        dutch(ar);
        print(a);
    }
}
