package org.example.Dec.Dec1;

//Given a sorted and rotated array arr[] of distinct elements, find the index of given key in the array. If the key is not present in the array, return -1.
//
//Examples:
//
//Input: arr[] = [5, 6, 7, 8, 9, 10, 1, 2, 3], key = 3
//Output: 8
//Explanation: 3 is present at index 8.
//
//Input: arr[] = [3, 5, 1, 2], key = 6
//Output: -1
//Explanation: 6 is not present.
//
//Input: arr[] = [33, 42, 72, 99], key = 42
//Output: 1
//Explanation: 42 is found at index 1.

public class SearchSortedRotatedArray {

    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        int key = 3;
        System.out.println(ssearch(arr, key));
    }

    private static int ssearch(int[] arr, int key) {

            // Initialize two pointers, lo and hi, at the start
            // and end of the array
            int lo = 0, hi = arr.length - 1;

            while (lo <= hi) {
                int mid = lo + (hi - lo) / 2;

                // If key found, return the index
                if (arr[mid] == key)
                    return mid;

                // If Left half is sorted
                if (arr[mid] >= arr[lo]) {

                    // If the key lies within this sorted half,
                    // move the hi pointer to mid - 1
                    if (key >= arr[lo] && key < arr[mid])
                        hi = mid - 1;

                        // Otherwise, move the lo pointer to mid + 1
                    else
                        lo = mid + 1;
                }

                // If Right half is sorted
                else {

                    // If the key lies within this sorted half,
                    // move the lo pointer to mid + 1
                    if (key > arr[mid] && key <= arr[hi])
                        lo = mid + 1;

                        // Otherwise, move the hi pointer to mid - 1
                    else
                        hi = mid - 1;
                }
            }

            // Key not found
            return -1;
        }
}
