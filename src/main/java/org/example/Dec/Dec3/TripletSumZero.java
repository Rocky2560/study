package org.example.Dec.Dec3;

//Given an array arr[], the task is to find all possible indices {i, j, k} of triplet {arr[i], arr[j], arr[k]} such that their sum is equal to zero and all indices in a triplet should be distinct (i != j, j != k, k != i). We need to return indices of a triplet in sorted order, i.e., i < j < k.
//
//Examples :
//
//Input: arr[] = {0, -1, 2, -3, 1}
//Output: {{0, 1, 4}, {2, 3, 4}}
//Explanation:  Two triplets with sum 0 are:
//arr[0] + arr[1] + arr[4] = 0 + (-1) + 1 = 0
//arr[2] + arr[3] + arr[4] = 2 + (-3) + 1 = 0
//
//Input: arr[] = {1, -2, 1, 0, 5}
//Output: {{0, 1, 2}}
//Explanation: Only triplet which satisfies the condition is arr[0] + arr[1] + arr[2] = 1 + (-2) + 1 = 0
//
//Input: arr[] = {2, 3, 1, 0, 5}
//Output: {{}}
//Explanation: There is no triplet with sum 0
import java.util.ArrayList;
import java.util.List;

public class TripletSumZero {

    // Java program to find triplet having sum zero using
// three nested loops
        static ArrayList<ArrayList<Integer>> findTriplets(int[] arr) {
            ArrayList<ArrayList<Integer>> res = new ArrayList<>();
            int n = arr.length;

            // Generating all triplets
            for (int i = 0; i < n - 2; i++) {
                for (int j = i + 1; j < n - 1; j++) {
                    for (int k = j + 1; k < n; k++) {

                        // If the sum of triplet equals to zero
                        // then add it's indexes to the result
                        if (arr[i] + arr[j] + arr[k] == 0) {
                            ArrayList<Integer> triplet = new ArrayList<>();
                            triplet.add(i);
                            triplet.add(j);
                            triplet.add(k);
                            res.add(triplet);
                        }
                    }
                }
            }
            return res;
        }

        public static void main(String[] args) {
            int[] arr = {0, -1, 2, -3, 1};
            ArrayList<ArrayList<Integer>> res = findTriplets(arr);
            for (List<Integer> triplet : res)
                System.out.println(triplet.get(0) + " " + triplet.get(1)
                        + " " + triplet.get(2));
        }

}
