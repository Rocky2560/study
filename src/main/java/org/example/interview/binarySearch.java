package org.example.interview;

import java.util.Arrays;

public class binarySearch {

    public static int binary(int []a, int k)
    {
        int left =0;
        int right = a.length-1;
        while (left <= right)
        {
            int mid = left+ (right-left)/2;
            if(a[mid] == k)
            {
               return mid;
            }
            else if(a[mid] > k)
            {
                right = mid-1;
            }
            else {
                left = mid+1;

            }
        }
        return -1;
    }

    public static int recursiveBinary(int [] arr, int left, int right,int key)
    {
        if (right >= left) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                return recursiveBinary(arr, left, mid - 1, key);

            } else {
                return recursiveBinary(arr, mid + 1, right, key);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] arr= {1,2,3,6,9};
        int key=9;
        System.out.println(Arrays.binarySearch(arr,9));
        int op = binary(arr,key);
        int rec = recursiveBinary(arr, 0, arr.length-1, key);
        if(rec == -1)
        {
            System.out.println("The number is not available ");
        }
        else
        {
            System.out.println("the number is "+op);
        }

    }
}
