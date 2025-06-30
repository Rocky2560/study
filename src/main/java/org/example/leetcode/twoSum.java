package org.example.leetcode;

import java.util.HashMap;
import java.util.HashSet;

public class twoSum {

    public static void main(String[] args) {
      int target = 15;
        int [] nums =  {1,2,3,14};
      HashMap<Integer, Integer> hashMap = new HashMap<>();

      for (int i=0; i<nums.length; i++)
      {
          //Calculate the complement of current number
          int complement = target - nums[i];

          if (hashMap.containsKey(complement))
          {
              System.out.println(hashMap.get(complement)+" "+ i);
          }
          hashMap.put(nums[i],i);

      }
        System.out.println("There is no target elements");
    }
}
