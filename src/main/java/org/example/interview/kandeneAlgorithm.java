package org.example.interview;

public class kandeneAlgorithm {

    public static void main(String[] args) {
        int [] arr  = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int maxsofar = arr[0];
        int maxsoEnding = arr[0];

        for (int i=1; i< arr.length; i++)
        {
            maxsoEnding = Math.max(arr[i], maxsoEnding+arr[i]);
            maxsofar = Math.max(maxsofar, maxsoEnding);
        }
        System.out.println(maxsofar);
    }
}
