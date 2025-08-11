    package org.example;


    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.List;
    import java.util.Map;

    /**
     * 2. Given an array of integers, write a method to find all pairs that sum to a specific target number.
     * Int[] nums = {2,4,3,5,7,-1,0}
     * Int target = 6;
     *{(1,3),}
     * Public void pairDetect
     */
    public class patternDetect {

        public static List<int[]> pairDetect(int[] arr, int target)
        {
            List<int[]> output = new ArrayList<>();
            HashMap<Integer,Integer> hashMap = new HashMap<>();
            for (int i = 0; i < arr.length; i++)
            {
                int complement = target-arr[i];
                if(hashMap.containsKey(complement))
                {
                   output.add(new int[]{hashMap.get(complement), i});
                }
                hashMap.put(arr[i],i);
            }
            return output;

        }

        public static void main(String[] args) {
            int[] nums = {2,4,3,5,7,-1,0};
            int target = 6;
            List<int[]> op = pairDetect(nums, target);
            for (int[] pair : op) {
                    System.out.println("(" + pair[0] + ", " + pair[1] + ")");
            }

        }
    }
