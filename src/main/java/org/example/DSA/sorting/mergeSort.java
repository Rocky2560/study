package org.example.DSA.sorting;

public class mergeSort {

    public void printArray(int [] arr)
    {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

    }
    public void sort (int [] arr, int [] temp, int low, int high)
    {
        if (low < high)
        {
            int mid = low + (high - low)/2;
            sort(arr, temp, low, mid);
            sort(arr, temp, mid+1, high);
            merger(arr, temp, low, mid, high);
        }
    }

    public void merger(int[] arr, int[] temp, int low, int mid, int high)
    {
        for (int i=low ; i<=high; i++)
        {
            temp[i] = arr[i];
        }

        int i = low; //Traveser left suborder array
        int j = mid+1; //Traveser right suborder array
        int k = low; //Will merge the both array into one

        while (i <= mid && j <= high)
        {
            if (temp[i] <= temp[j])
            {
                arr[k] = temp[i];
                i++;
            }
            else
            {
                arr[k] = temp[j];
                j++;
            }
            k++;
        }

        while ( i <= mid)
        {
            arr[k] = temp[i];
            k++;
            i++;
        }

    }

    public static void main(String[] args) {

        int [] arr = new int[] {2,5,1,3};
        mergeSort mergeSort = new mergeSort();
        mergeSort.sort(arr, new int[arr.length], 0, arr.length -1 );
        mergeSort.printArray(arr);

    }
}
