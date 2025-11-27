package org.example.Nov.Nov27;

//Given an array arr[] of n integers, construct a product array res[] (of the same size) such that res[i] is equal to the product of all the elements of arr[] except arr[i].
//
//Example:
//
//Input: arr[] = [10, 3, 5, 6, 2]
//Output: [180, 600, 360, 300, 900]
//Explanation:
//
//For i=0, res[i] = 3 * 5 * 6 * 2 is 180.
//For i = 1, res[i] = 10 * 5 * 6 * 2 is 600.
//For i = 2, res[i] = 10 * 3 * 6 * 2 is 360.
//For i = 3, res[i] = 10 * 3 * 5 * 2 is 300.
//For i = 4, res[i] = 10 * 3 * 5 * 6 is 900.
//Input: arr[] = [12, 0]
//Output: [0, 12]
//Explanation:
//
//For i = 0, res[i] = 0.
//For i = 1, res[i] = 12.

import java.util.Arrays;

public class ProductItself {

    public static void main(String[] args) {
        int[] arr = {10, 3, 5, 6, 2};
        int[] res = productExceptSelf(arr);

        System.out.println(Arrays.toString(res));
    }

    // Function to calculate the product of all
    // elements except the current element
    static int[] productExceptSelf(int[] arr) {
        int n = arr.length;
        int [] prefProduct = new int[n];
        int [] suffProdcut = new int[n];
        int [] res = new int[n];

        prefProduct[0] = 1;
        for (int i = 1; i < n; i++) {
            prefProduct[i] = arr[i-1] * prefProduct[i-1];
        }

        suffProdcut[n-1] = 1;
        for (int i = n-2; i >= 0; i--) {
            suffProdcut[i] = arr[i+1] * suffProdcut[i+1];
        }

        for (int i = 0; i < n; i++) {
            res[i] = prefProduct[i]* suffProdcut[i];
        }
        return res;
    }
    }

