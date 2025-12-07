package org.example.Dec.Dec7;

//Given a sorted array arr[] where every element appears exactly twice except one element that appears only once, find that single element.
//
//Examples:
//
//Input: arr[] = [1, 1, 2, 2, 3, 4, 4]
//Output: 3
//Explanation: All numbers except 3 occur twice in the array.
//
//Input: arr[] = [1, 1, 3, 3, 4, 4, 5, 5, 7, 7, 8]
//Output: 8
//Explanation: All numbers except 8 occur twice in the array.

public class DuplicateSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3,3, 4, 4, 5 };
        System.out.println(single(arr));
        System.out.println(singleBinary(arr));
    }

    private static int singleBinary(int[] arr) {
        int left =0, right = arr.length-1;
        while (left < right)
        {
            int mid = left + (right-left)/2;
            if (mid % 2 == 1) {mid--;}
            if (arr[mid] == arr[mid+1]) {left = mid+2;}
            else {right = mid;}
        }
        return arr[left];
    }

    private static int single(int[] arr) {
        for (int i = 0; i < arr.length -1; i+=2) {
            if (arr[i] != arr[i+1]) return arr[i];
        }
        return arr[arr.length-1];
    }
}
