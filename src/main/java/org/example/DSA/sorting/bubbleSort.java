package org.example.DSA.sorting;

public class bubbleSort {

    public void bubbleSort(int[] a)
    {
        boolean isSwaped;
        for (int i=0; i<a.length-1; i++)
        {
            isSwaped = false;
            for (int j=0; j<a.length-1-i; j++)
            if (a[j]> a[j+1])
            {
                int temp =a[j];
                a[j] = a[j+1];
                a[j+1] = temp;
                isSwaped = true;
            }
            if (isSwaped == false) break;
        }

    }
    public void print(int [] a)
    {
        for (int i:a)
        {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        int [] a ={11,2,31,4};
        bubbleSort bubbleSort = new bubbleSort();
        bubbleSort.bubbleSort(a);
        bubbleSort.print(a);

    }
}
