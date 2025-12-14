package org.example.Dec.Dec14;

import java.util.HashMap;

public class Countpairs {

    // Java Program to count all pairs with difference equal to k
// using Hash Map

        static int countPairs(int[] arr, int k) {
            int n = arr.length;
            HashMap<Integer, Integer> freq = new HashMap<>();
            int cnt = 0;

            for (int i = 0; i < n; i++) {

                // Check if the complement (arr[i] + k)
                // exists in the map. If yes, increment count
                if (freq.containsKey(arr[i] + k))
                    cnt += freq.get(arr[i] + k);

                // Check if the complement (arr[i] - k)
                // exists in the map. If yes, increment count
                if (freq.containsKey(arr[i] - k))
                    cnt += freq.get(arr[i] - k);

                // Increment the frequency of arr[i]
                freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
            }
            return cnt;
        }

        public static void main(String[] args) {
            int[] arr = {1, 4, 1, 4, 5};
            int k = 3;

            System.out.println(countPairs(arr, k));
        }
}
