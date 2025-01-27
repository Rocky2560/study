package org.example.DSA.sorting;

public class squareSotedArray {

    public void sort (int [] arr, int n)
    {
        int result [] = new int[n];
       int i=0, j = n-1;
       for (int k = n-1; k>=0 ; k--)
       {
           if (Math.abs(arr[i]) > Math.abs(arr[j]))
           {
               result[k] = arr[i] * arr[i];
               i++;
           }
           else
           {
               result[k] = arr[j] * arr[j];
               j--;
           }
       }
       print(result);

    }

    public void print (int[] a)
    {
        for (int x: a)
        {
            System.out.println(x);
        }
    }
    public static void main(String[] args) {
        int [] arr = {-4,-6,7,8,-2 };
        int n = arr.length;
        squareSotedArray squareSotedArray = new squareSotedArray();
        squareSotedArray.sort(arr, n);
    }
}
