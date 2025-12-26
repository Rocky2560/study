package org.example.Dec.Dec26;

import java.util.HashMap;
import java.util.Hashtable;

public class FoueElementeauls {

    // Driver Code
    public static void main(String[] args) {

        int[] arr = {3, 4, 7, 1, 2, 9, 8};

        int[] result = findPairs(arr);

        printOutput(result);
    }

    private static void printOutput(int[] result) {
        if (result.length == 0) {
            System.out.println("No valid pairs found");
        } else {
            System.out.println("(" + result[0] + ", " + result[1] +
                    ") and (" + result[2] + ", " + result[3] + ")");
        }
    }

    private static int[] findPairs(int[] arr) {
        HashMap<Integer, int[]> hashMap = new HashMap<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                int result = arr[i]+arr[j];
                if (hashMap.containsKey(result))
                {
                    int[] p = hashMap.get(result);
                    if (p[0] != i && p[0] != j && p[1] != i && p[1] != j)
                    {
                        return new int[]{arr[p[0]], arr[p[1]], arr[i], arr[j]};
                    }
                }
                hashMap.put(result, new  int[]{i,j});
            }

        }
        return new int[]{};
    }
}
