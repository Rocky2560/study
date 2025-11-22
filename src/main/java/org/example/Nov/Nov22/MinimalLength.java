package org.example.Nov.Nov22;

import java.util.HashMap;
import java.util.Map;

public class MinimalLength {


    public static void main(String[] args) {
        int target  =7;
        int [] nums = {2,3,1,2,4,3};
        System.out.println(minSubArrayLen(nums, target));
    }

    public static int minSubArrayLen(int[] nums, int target) {
        int n = nums.length;
        int left =0, sum = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            while (sum >= target) {
            min = Math.min(min, i-left+1);
            sum -= nums[left];
            left++;
            }
        }
        return min;
    }
}
