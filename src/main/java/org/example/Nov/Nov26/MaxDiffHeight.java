package org.example.Nov.Nov26;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MaxDiffHeight {

    public static void main(String[] args) {
        int k = 2;
        int[] arr = {1, 5, 8, 10};

        int ans = getMinDiff(arr, k);
        System.out.println(ans);
    }

    private static int getMinDiff(int[] arr, int k) {
        Arrays.sort(arr);
        int n = arr.length;
        int ans = arr[0]- arr.length;
        int smallest = arr[0]+k, largest = arr[n-1]-k, res= Integer.MAX_VALUE;
        int minH = Integer.MAX_VALUE, maxH= Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i]-k < 0) continue;
            minH = Math.min(smallest, arr[i]+k);
            maxH = Math.max(largest, arr[i-1]-k);
            res = Math.min(res, maxH-minH);
        }
return res;
    }
}
