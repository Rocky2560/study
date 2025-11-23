package org.example.Nov.Nov22;

//Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
//
//Notice that the solution set must not contain duplicate triplets.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] in = {-1, 0, 1, 2, -1, -4};
        // 🎯 Call the method!
        List<List<Integer>> result = threeSum(in);

        // 🖨️ Print result
        System.out.println("Triplets summing to 0:");
        for (List<Integer> triplet : result) {
            System.out.println(triplet);
        }
    }
        private static List<List<Integer>> threeSum (int[] nums) {
            List<List<Integer>> op = new ArrayList<>();

            if (nums == null || nums.length < 3) {
                return op;
            }

            Arrays.sort(nums);

            for (int i = 0; i < nums.length - 2; i++) {
                if (i > 0 && nums[i] == nums[i - 1]) continue;
                int left = i + 1, right = nums.length - 1;
                int target = -nums[i];
                while (left < right) {
                    int sum = nums[left] + nums[right];

                    if (sum == target) {
                        op.add(Arrays.asList(nums[left], nums[right], nums[i]));

                        while (left < right && nums[left] == nums[left + 1]) {
                            left++;
                        }
                        while (left < right && nums[right] == nums[right - 1]) {
                            right--;
                        }
                        left++;
                        right--;
                    } else if (sum > target) { right --;
                    }
                    else left++;
                }


            }
            return op;
        }

    }