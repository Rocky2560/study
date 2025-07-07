package org.example.leetcode;

//Product of Array Itself

import java.util.Arrays;

public class arrayProduct {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4};
        int [] result = new int[nums.length];

        Arrays.fill(result, 1);

        int prefix=1, post=1;

        for (int i=0; i<nums.length; i++)
        {
            result[i] = prefix;
            prefix = nums[i] * prefix;
        }

        for (int i=nums.length-1; i>=0; i--)
        {
            result[i] = result[i]*post;
            post = post*nums[i];

        }
        for (int x: result)
        {
            System.out.println(x);
        }

    }
}
