package org.example.Nov.Nov14;

//Given an array of integers arr[], move all the zeros to the end of the array while maintaining the relative order of all non-zero elements.
//
//Examples:
//
//Input: arr[] = [1, 2, 0, 4, 3, 0, 5, 0]
//Output: [1, 2, 4, 3, 5, 0, 0, 0]
//Explanation: There are three 0s that are moved to the end.
//
//Input: arr[] = [10, 20, 30]
//Output: [10, 20, 30]
//Explanation: No change in array as there are no 0s.
//
//Input: arr[] = [0, 0]
//Output: [0, 0]
//Explanation: No change in array as there are all 0s.
public class MovingZeros {

    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
        pushZerosToEnd(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }

        pushZerosToEndTraversal(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }

        pushZerosToEndSwap(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    private static void pushZerosToEnd(int[] arr) {
        int n = arr.length;
        int [] temp = new int [n];
        int count =0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                temp[count++] = arr[i];
            }
        }
            while (count < n)
            {
                temp[count++]= 0;
            }
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
            
        }
    }

    private static void pushZerosToEndTraversal(int[] arr) {
        int n = arr.length;
        int count =0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }
        while (count < n)
        {
            arr[count++]= 0;
        }
    }

    private static void pushZerosToEndSwap(int[] arr) {
        int n = arr.length;
        int count =0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        }

    }
}
