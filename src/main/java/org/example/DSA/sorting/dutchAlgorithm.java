package org.example.DSA.sorting;

public class dutchAlgorithm {

    public static void ducthNational(int[] arr) {
        int i = 0, j = 0, k = arr.length - 1;
        while (i <= k) {
            if (arr[i] == 0) {
                swap(arr, i, j);
                i++;
                j++;
            } else if (arr[i] == 1) {
                i++;
            } else if (arr[i] == 2) {
                swap(arr, i, k);
                k--;
            }
        }
    }

    public static void print (int []  arr)
    {
        for (int x : arr)
        {
            System.out.println(x);
        }
    }

        public static void swap (int [] arr, int i, int k)
        {
            int temp = arr[i];
            arr[i] = arr[k];
            arr[k] = temp;
        }

    public static void main(String[] args) {
        int arr [] = {0,1,0,0,2,1,2,1};
        ducthNational(arr);
        print(arr);
    }
}
