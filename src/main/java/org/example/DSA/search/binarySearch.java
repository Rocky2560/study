package org.example.DSA.search;

public class binarySearch {
    public static int binarySearch(int[] a, int n, int x)
    {
        int low =0;
        int high =n;
        while (low <=high)
        {
            int mid = (high+low)/2;
            if (a[mid] == x) return mid;
            else if (a[mid] > x) high =mid -1;
            else low = mid+1;
        }
        return -1;
    }

    public static int searchInsert(int [] a, int target)
    {
    int left =0;
    int right = a.length-1;
    while (left <= right)
    {
        int mid = (left + (right - left)/2);
        if (a[mid] == target) return mid;
        if (a[mid] > target) right = mid -1;
        else left = mid + 1;
    }
    return left;
    }

    public static void main(String[] args) {
        int [] a ={1,2,3,4};
        int x = binarySearch(a,a.length-1,1);
        int y = searchInsert(a, 8);
        System.out.println(x+1);
        System.out.println(y+1);

    }
}
