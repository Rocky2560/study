package org.example.interview;

import java.util.Arrays;

/**
 * Given an array arr[] of n integers and a target value, check if there exists a pair whose sum equals the target.
 * This is a variation of the 2Sum problem.
 * Input: arr[] = [0, -1, 2, -3, 1], target = -2
 * Output: true
 * Explanation: There is a pair (1, -3) with the sum equal to given target, 1 + (-3) = -2.
 *
 * Input: arr[] = [1, -2, 1, 0, 5], target = 0
 * Output: false
 * Explanation: There is no pair with sum equals to given target.
 */

public class twoSum {

    public static void bruteSum(int [] a, int target)
    {
        for (int i = 0; i < a.length; i++) {
            for (int j=i+1; j < a.length; j++)
            {
                if(a[i] + a[j] == target)
                {
                    System.out.println(i+" "+j);
                }
            }
        }
    }

    public static int sortBinary(int[] a, int target)
    {
        int left = 0, right = a.length-1;
        while (left < right)
        {
            int mid = left + (right - left)/2;
            if (a[mid] == target)
            {
                return mid;
            }
            else if (a[mid] > target)
            {
                right = mid-1;
            }
            else {
                left = mid+1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int [] a= {0,-1,2,-3,1};
        int target = -2;
        bruteSum(a, target);

        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            int complement = target - a[i];
            int p = sortBinary(a, complement);

        }
    }
}
