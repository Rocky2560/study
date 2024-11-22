package org.example.sorting;

public class selection {

    static void selectionSort(int[] b)
    {

        for (int i=0; i<b.length-1; i++) {
            int min = i;
            for (int j = i+1  ; j < b.length; j++) {
                if (b[min] > b[j]) {
                    min = j;
                }
            }

                int temp = b[i];
                b[i] = b[min];
                b[min] = temp;
            }
        }

    static void printArray(int [] arr)
    {
        for (int a: arr)
        {
            System.out.print(a+" ");
        }
    }
    public static void main(String[] args) {
        int [] in = {2,4,6,1,9};
        System.out.println("Array is");
        printArray(in);

        selectionSort(in);
        System.out.println("Sorted Array is");
        printArray(in);

    }
}
