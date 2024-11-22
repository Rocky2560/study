package org.example.sorting;

public class bubblesort {

    static void printArray(int [] a)
    {
        for (int i:a)
        {
            System.out.print(i+" ");
        }
    }

    static void sort(int[] a)
    {
        int n = a.length;
        int temp;
        for (int i=0;i<n-1;i++)
        {
            for (int j=0; j<n-i-1; j++)
            {
                if (a[j]>a[j+1])
                {
                   temp = a[j];
                   a[j] = a[j+1];
                   a[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int [] a ={ 64, 34, 25, 12, 22, 11, 90};
        System.out.println("Array before sorting:");
        printArray(a);

        System.out.println("Array after sorting");
        sort(a);
        printArray(a);
    }
}
