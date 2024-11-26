package org.example.Array.Level2;

import java.util.Arrays;

public class Ksmallest {

    // Naive Approach
    static int kthSmallest(int[] arr, int k)
    {
        Arrays.sort(arr);
        return arr[k-1];
    }

    //Quick Sort
    // partition function similar to quick sort
    // Considers last element as pivot and adds
    // elements with less value to the left and
    // high value to the right and also changes
    // the pivot position to its respective position
    // in the final array.
    static int partition(int [] a, int l , int r)
    {
     int pivot = a[r], pivotloc = l;
        for (int i = l; i <= r; i++) {

            if(a[i]<pivot)
            {
                int temp = a[i];
                a[i] = a[pivotloc];
                a[pivotloc] = temp;
                pivotloc++;
            }
            
        }
        // swapping pivot to the final pivot location
        int temp = a[r];
        a[r] = a[pivotloc];
        a[pivotloc] = temp;
    return pivotloc;
    }

    static int quickSort(int [] a, int l, int r, int k)
    {
        int partition = partition(a, l, r);

        if (partition == k-1)
        {
            return a[partition];
        }
        else if(partition < k-1)
        {
            return quickSort(a, partition+1, r, k);
        }
        else
        {
            return quickSort(a,l, partition-1, k);
        }
    }

    public static void main(String[] args) {
     int arr[] = { 12, 3, 5, 7, 19 };
     int a [] =  {12, 3, 5, 7,19};
     int k = 2;
     System.out.println("K'th smallest element is "+ kthSmallest(arr, k));
     System.out.println();
     System.out.println("K'th smallest element is "+ quickSort(arr,0, a.length-1, k));

    }
}
