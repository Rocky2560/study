package org.example.Dec.Dec7;

//Given an integer array arr[], find the sum of any two elements whose sum is closest to zero.
//
//Note: In case if we have two ways to form sum closest to zero, return the maximum sum among them.
//
//Examples:
//
//Input: arr[] = [-8, 5, 2, -6]
//Output: -1
//Explanation: The min absolute sum pair is (5, -6)
//
//Input:  arr[] = [0, -8, -6, 3]
//Output: 3
//Explanation: We have a tie between (0, 3) and (-6, 3). We pick the max sum in this case which is 0+3
//
//Input: arr[] = [-7, 4, 1, -2]
//Output: -1
//Explanation: The min absolute sum pair is (1, -2).

import java.util.Arrays;

public class SumClosertoZero {

        static int minAbsSumPair(int[] arr) {

            Arrays.sort(arr);

            int n = arr.length;

            // Variable to store the closest sum
            int res = Integer.MAX_VALUE;

            // Iterate over the array
            for (int i = 0; i < n; i++) {

                // Consider current element as first
                // element of the pair and find the
                // other element using binary search
                int x = arr[i];

                int left = i + 1, right = n - 1;

                while (left <= right) {
                    int mid = (left + right) / 2;

                    int curr = arr[mid] + x;

                    // If exact pair is found
                    if (curr == 0) {
                        return 0;
                    }

                    // Update res if the current pair is closer
                    if (Math.abs(curr) < Math.abs(res)) {
                        res = curr;
                    }

                    else if (Math.abs(curr) == Math.abs(res)) {
                        res = Math.max(res, curr);
                    }

                    // If current is smaller than 0,
                    // go to right side. Else on the
                    // left side.
                    if (curr < 0) {
                        left = mid + 1;
                    } else {
                        right = mid - 1;
                    }
                }
            }

            return res;
        }

        public static void main(String[] args) {
            int[] arr = { 0, -8, -6, 3 };
            System.out.println(minAbsSumPair(arr));
        }
    }

