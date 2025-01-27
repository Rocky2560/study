package org.example.DSA.sorting;

public class quickSort {

    public int partition( int[] arr, int low, int high)
    {
        int pivot = arr[high];
        int i = low;
        int j = low;
        while (i <= high)
        {
            if (arr[i] <= pivot) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
                i++;


        }
        return j-1;
    }

    public void sort (int [] arr, int low, int high)
    {
        if ( low < high)
        {
            int p = partition(arr, low, high);
            sort(arr, low, p-1);
            sort(arr, p + 1, high);
        }
    }

    public void print (int[] a)
    {
        for (int x: a)
        {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        int arr [] = {1,4,2,6,3,5};
        quickSort quickSort = new quickSort();
        quickSort.sort(arr,0,5);
        quickSort.print(arr);
    }
}
