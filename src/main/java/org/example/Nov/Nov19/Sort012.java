package org.example.Nov.Nov19;

import java.util.Arrays;

//Sort an array of 0s, 1s and 2s - Dutch National Flag Problem
//Last Updated : 01 Aug, 2025
//Given an array arr[] consisting of only 0s, 1s, and 2s. The objective is to sort the array, i.e., put all 0s first, then all 1s and all 2s in last.
//
//This problem is the same as the famous "Dutch National Flag problem". The problem was proposed by Edsger Dijkstra. The problem is as follows:
//
//Given n balls of colour red, white or blue arranged in a line in random order. You have to arrange all the balls such that the balls with the same colours are adjacent with the order of the balls, with the order of the colours being red, white and blue (i.e., all red coloured balls come first then the white coloured balls and then the blue coloured balls).
public class Sort012 {

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 0, 1, 2};
//        sort012(arr);
//        sort012BetterApprocsh(arr);

        sort012BDutch(arr);
        for (int num : arr)
            System.out.print(num + " ");
    }

    private static void sort012BetterApprocsh(int[] arr) {
        int c1=0,c2=0,c0=0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) c0+=1;
            if (arr[i] == 1) c1+=1;
            if (arr[i] == 2) c2+=1;
        }
        int j=0;
        for (int i = 0; i < c0; i++)  arr[j++]=0;
        for (int i = 0; i <c1; i++)   arr[j++]=1;
        for (int i = 0; i < c2; i++)  arr[j++]=2;

    }

    private static void sort012BDutch(int[] arr) {
        int lo=0,mid=0,hi= arr.length-1;

       while (mid <= hi)
       {
           if (arr[mid] == 0)
           {
               int temp = arr[lo];
               arr[lo++] = arr[mid];
               arr[mid++] = temp;
           } else if (arr[mid] == 1) {mid++;
           }
           else
           {
               int temp = arr[mid];
               arr[mid] = arr[hi];
               arr[hi--] = temp;
           }
       }
    }

    private static void sort012(int[] arr) {
        Arrays.sort(arr);
    }
}
