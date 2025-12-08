package org.example.Dec.Dec8;

import java.util.HashSet;

//Given an unsorted array and an integer x, the task is to find if there exists a pair of elements in the array whose absolute difference is x.
//
//Examples:
//
//Input: arr[] = [5, 20, 3, 2, 50, 80], x = 78
//Output: Yes
//Explanation: The pair is {2, 80}.
//
//Input: arr[] = [90, 70, 20, 80, 50], x = 45
//Output: No
//Explanation: No such pair exists.
public class PairDifference {

    public static void main(String[] args) {
        int[] arr = {5, 20, 3, 2, 50, 80};
        int x = 78;
        if (hasTripletSum(arr, x)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    private static boolean hasTripletSum(int[] arr, int target) {
        HashSet<Integer> hashSet = new HashSet<>();
        int n = arr.length;
        for(int x: arr)
        {
            if (hashSet.contains(target+x) || hashSet.contains(x-target))
            {
                return true;
            }
            hashSet.add(x);
        }
        return false;
    }
}
