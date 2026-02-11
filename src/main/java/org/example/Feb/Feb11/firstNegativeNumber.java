package org.example.Feb.Feb11;

import java.util.ArrayList;
import java.util.List;

public class firstNegativeNumber {

    public static void main(String[] args) {
        int [] arr = {12, -1, -7,  8, -15, 30, 16, 28};
        int k = 3;
        List<Integer> res = firstNegInt(arr, k);
        System.out.println(res);
    }

    private static List<Integer> firstNegInt(int[] arr, int k) {
        int firstNega = 0;
        List<Integer> res = new ArrayList<>();
        int n = arr.length;

        for (int i = k - 1; i < n; i++) {
            while (firstNega < i && (firstNega <= i - k || arr[firstNega] >= 0)) {
                firstNega++;
            }
            // Check if a negative element is found,
            // otherwise use 0
            if (firstNega < n && arr[firstNega] < 0) {
                res.add(arr[firstNega]);
            } else {
                res.add(0);
            }
        }
            return res;
        }

}
