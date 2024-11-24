package org.example.Array;

import java.util.Arrays;

public class waveArray {

    static void swap (int[] a, int i, int j)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    //Sorting and swap adjacent
    static void swap(int [] a)
    {
        Arrays.sort(a);

        for (int i=0; i<a.length-1; i+=2)
        {
            swap(a, i, i+1);
        }
    }

    // This function sorts arr[0..n-1] in wave form, i.e.,
    // arr[0] >= arr[1] <= arr[2] >= arr[3] <= arr[4]....
    static void sort(int[] a) {
        for (int i = 0; i <a.length ; i++) {

            if (i < 0 && a[i-1] > a[i])
            {
                swap(a, i, i-1);
            }
            if (i < a.length-1 && a[i+1] > a[i])
            {
                swap(a, i, i+1);
            }

        }
    }

    static void print(int[] a) {
        for (int x : a) {
            System.out.print(x + " ");

        }
    }
        public static void main (String[] args){
            int [] a = {10, 90, 49, 2, 1, 5, 23};
            swap(a);
            print(a);
            System.out.println();

            sort(a);
            print(a);
        }
    }
