package org.example.Nov.Nov20;

//Given a sorted array, arr[], containing only 0s and 1s, find the transition point, i.e., the first index where 1 was observed, and before that, only 0 was observed. If arr does not have any 1, return -1. If the array does not have any 0, return 0.
//
//Examples :
//
//Input: 0 0 0 1 1
//Output: 3
//Explanation: Index 3 is the transition point where first 1 was observed.
//
//Input: arr[] = [0, 0, 0, 0]
//Output: -1
//Explanation: Since, there is no "1", the answer is -1.
//
//Input: 0 0 0 0 1 1 1 1
//Output: 4
//Explanation: Index 4 is the transition point where first 1 was observed.
//
//Input: arr[] = [1, 1, 1]
//Output: 0
//Explanation: There are no 0s in the array, so the transition point is 0.

public class TransitionPoint {


    public static void main(String args[])
    {
        int arr[] = { 0, 0, 0, 0, 1, 1 };

        System.out.println(transitionPoint(arr));
    }

    private static int transitionPoint(int[] arr) {

        int n = arr.length;
        int lb =0, ub= n-1;

        while (lb <= ub)
        {
            int mid = lb + (ub-lb)/2;

            if (arr[mid] == 0)
            {
                lb = mid +1;
            } else if (arr[mid] == 1) {
                if (mid ==1 || (mid > 0 && arr[mid-1] == 0)) return mid;

                ub=mid-1;
            }
        }
        return -1;

    }
}
