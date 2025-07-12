package org.example.interview;

import java.util.Scanner;

public class buuble_Sort {

    public static void main(String[] args) {
        int [] arr = {11,2,13,4};
//        Scanner sc = new Scanner(System.in);
//        int [] a
        int left =0, right = arr.length-1;
        for (int i=0; i<arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int x: arr)
        {
            System.out.println(x);
        }


    }

}
