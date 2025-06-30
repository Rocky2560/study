package org.example.leetcode;

import java.util.HashSet;

public class duplicateNumber {
    public static void main(String[] args) {


        int target = 1;
        int[] nums = {1, 2, 3, 14};
        HashSet<Integer> hashSet = new HashSet<>();
        for (int x : nums) {
            if (hashSet.contains(x)) {
                System.out.println("Dupliacte Found");
            }
            hashSet.add(x);
        }
        System.out.println("Duplicate not found");
    }
}
