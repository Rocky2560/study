package org.example.Nov.Nov17;

import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {
        int [] in = {2,3,4,5,2,1};
        int[] op = twoSum(in);
        for (int x:op)
        {
            System.out.println(x);
        }
    }

    private static int[] twoSum(int[] in) {
        int target = 7;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < in.length; i++) {
            int complement = target - in[i];
            if (hashMap.containsKey(complement))
            {
                return new int[] {hashMap.get(complement), i};
            }
            hashMap.put(in[i],i);
        }
        return new int[]{};
    }
}
