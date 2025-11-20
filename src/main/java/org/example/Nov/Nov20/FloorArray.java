package org.example.Nov.Nov20;

//Given a sorted array and a value x, find the element of the floor of x. The floor of x is the largest element in the array smaller than or equal to x.
//
//        Examples:
//
//Input: arr[] = [1, 2, 8, 10, 10, 12, 19], x = 5
//Output: 1
//Explanation: Largest number less than or equal to 5 is 2, whose index is 1
//
//Input: arr[] = [1, 2, 8, 10, 10, 12, 19], x = 20
//Output: 6
//Explanation: Largest number less than or equal to 20 is 19, whose index is 6
//
//Input : arr[] = [1, 2, 8, 10, 10, 12, 19], x = 0
//Output : -1
//Explanation: Since floor doesn't exist, output is -1.
public class FloorArray {

    public static void main(String[] args)
    {
        int arr[] = { 1, 2, 4, 6, 10, 12, 14 };
        int x = 7;
        int index = findFloor(arr, x);
        int index1 = findFloorBinary(arr,x);

        System.out.print(index);
        System.out.print(index1);
    }

    private static int findFloorBinary(int[] arr, int x) {
        int left =0, right = arr.length-1;
        int result=-1;
        while (left < right)
        {
            int mid = left + (right-left)/2;
            if (arr[mid] <= x){ result = mid; left = mid+1;}
            else {right = mid-1; }
        }
        return result;
    }

    private static int findFloor(int[] arr, int x) {

        int n = arr.length;
        if (x >= arr[arr.length -1]) return n-1;
        if (x < arr[0]) return -1;
        int ans =-1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > x) return i-1;
        }
        return ans;
    }
}
