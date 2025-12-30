package org.example.Dec.Dec30;
//Given an array arr[] and an integer k, return the count of distinct numbers in all windows of size k.
//
//Examples:
//
//Input: arr[] = [1, 2, 1, 3, 4, 2, 3], k = 4
//Output: [3, 4, 4, 3]
//Explanation: First window is [1, 2, 1, 3], count of distinct numbers is 3.
//                       Second window is [2, 1, 3, 4] count of distinct numbers is 4.
//                       Third window is [1, 3, 4, 2] count of distinct numbers is 4.
//                       Fourth window is [3, 4, 2, 3] count of distinct numbers is 3.
//
//Input: arr[] = [4, 1, 1], k = 2
//Output: [2, 1]
//Explanation: First window is [4, 1], count of distinct numbers is 2.
//                       Second window is [1, 1], count of distinct numbers is 1.


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class CountDistinctElements {

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 4, 2, 3};
        int k = 4;

        ArrayList<Integer> res = countDistinct(arr, k);
        for (int ele : res) {
            System.out.print(ele + " ");
        }
    }

    private static ArrayList<Integer> countDistinct(int[] arr, int k) {
        int n = arr.length;
        ArrayList<Integer> res = new ArrayList<>();
        HashMap<Integer, Integer> freq = new HashMap<>();

//        / Store the frequency of elements of the first window
        for (int i = 0; i < k; i++) {
            freq.put(arr[i], freq.getOrDefault(arr[i], 0)+1);
        }

        // Store the count of distinct elements of the first window
        res.add(freq.size());

        for (int i = k; i < n; i++) {
            freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
            freq.put(arr[i-k], freq.getOrDefault(arr[i-k], 0) - 1);

            if (freq.get(arr[i - k]) == 0) {
                freq.remove(arr[i - k]);
            }

            res.add(freq.size());
        }
    return res;
    }
}
//The idea is to use Sliding Window Technique and count the number of distinct element in the current window using the count of previous window. Maintain a hash map or dictionary to store the frequency of elements of the current window and the count of distinct elements in the window will be equal to the size of the hash map.
//
//Store the frequency of first k elements in the hash map. Now start iterating from index = k,
//
//increase the frequency of arr[k] in the hash map.
//decrease the frequency of arr[i - k] in the hash map. If frequency of arr[i - k] becomes 0, remove arr[i] from the hash map.
//insert size of hash map into the resultant array.