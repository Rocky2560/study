package org.example.Dec.Dec17;

//Given two sorted arrays a[] and b[] and an element k, the task is to find the element that would be at the kth position of the combined sorted array.
//
//Examples :
//
//Input: a[] = [2, 3, 6, 7, 9], b[] = [1, 4, 8, 10], k = 5
//Output: 6
//Explanation: The final combined sorted array would be [1, 2, 3, 4, 6, 7, 8, 9, 10]. The 5th element of this array is 6.
//Input: a[] = [1, 4, 8, 10, 12], b[] = [5, 7, 11, 15, 17], k = 6
//Output: 10
//Explanation: Combined sorted array is [1, 4, 5, 7, 8, 10, 11, 12, 15, 17]. The 6th element of this array is 10.
//Constraints:
//1 ≤ a.size(), b.size() ≤ 106
//1 ≤ k ≤ a.size() + b.size()
//0 ≤ a[i], b[i] ≤ 108

public class KthElementTwoSortedArrays {

    public static int kthElement(int[] a, int[] b, int k) {
        // Ensure a is the smaller array
        if (a.length > b.length) {
            return kthElement(b, a, k);
        }

        int n = a.length;
        int m = b.length;

        int low = Math.max(0, k - m);
        int high = Math.min(k, n);

        while (low <= high) {
            int i = (low + high) / 2;
            int j = k - i;

            int aLeft  = (i == 0) ? Integer.MIN_VALUE : a[i - 1];
            int aRight = (i == n) ? Integer.MAX_VALUE : a[i];
            int bLeft  = (j == 0) ? Integer.MIN_VALUE : b[j - 1];
            int bRight = (j == m) ? Integer.MAX_VALUE : b[j];

            if (aLeft <= bRight && bLeft <= aRight) {
                return Math.max(aLeft, bLeft);
            } else if (aLeft > bRight) {
                high = i - 1;
            } else {
                low = i + 1;
            }
        }

        throw new IllegalArgumentException("Invalid input");
    }

    public static void main(String[] args) {
        int[] a1 = {2, 3, 6, 7, 9};
        int[] b1 = {1, 4, 8, 10};
        System.out.println(kthElement(a1, b1, 5)); // 6

        int[] a2 = {1, 4, 8, 10, 12};
        int[] b2 = {5, 7, 11, 15, 17};
        System.out.println(kthElement(a2, b2, 6)); // 10
    }
}

