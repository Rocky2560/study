package org.example.Nov.Nov20;

import java.util.ArrayList;
import java.util.List;

public class ClosetSumPair {

    public static void main(String[] args) {
        int[] arr1 = {1, 4, 5, 7};
        int[] arr2 = {10, 20, 30, 40};
        int x = 38;

        List<Integer> result = findClosestPair(arr1, arr2, x);
        System.out.println("[" + result.get(0) + ", " + result.get(1) + "]");
        // ✅ Output for x=38: [7, 30]  (7+30=37, |37-38|=1)
        // Try x=32 → [1,30] (31, diff=1) or [5,30]=35? Wait—let's check:
        // 1+30=31 → |31-32|=1 ✅ best
        // 7+30=37 → 5 away ❌
        // So output: [1, 30] ✔️
    }

    // ✅ Optimal: O(m + n), assumes BOTH arrays are sorted (non-decreasing)
    private static List<Integer> findClosestPair(int[] arr1, int[] arr2, int x) {
        int i = 0;                     // pointer at start of arr1 (smallest)
        int j = arr2.length - 1;      // pointer at end of arr2 (largest)

        int bestDiff = Integer.MAX_VALUE;
        int bestA = arr1[0], bestB = arr2[0];

        while (i < arr1.length && j >= 0) {
            int sum = arr1[i] + arr2[j];
            int diff = Math.abs(sum - x);

            // Found a better (closer) pair?
            if (diff < bestDiff) {
                bestDiff = diff;
                bestA = arr1[i];
                bestB = arr2[j];
            }

            // Move pointers intelligently
            if (sum < x) {
                i++;  // need bigger sum → increase smaller element
            } else if (sum > x) {
                j--;  // need smaller sum → decrease larger element
            } else {
                // sum == x → perfect! can’t do better
                break;
            }
        }

        List<Integer> result = new ArrayList<>();
        result.add(bestA);
        result.add(bestB);
        return result;
    }
}