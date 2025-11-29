package org.example.Nov.Nov29;

import java.util.HashMap;
import java.util.Map;

public class substringpatter012 {

        public static int countSubstrs(String s) {
            int n = s.length(), cnt = 0;
            Map<String, Integer> mp = new HashMap<>();
            int z = 0, o = 0, t = 0;

            // Initialize the map with the base case (0, 0)
            mp.put("0,0", 1);

            for (int i = 0; i < n; i++) {

                if (s.charAt(i) == '0') z++;
                if (s.charAt(i) == '1') o++;
                if (s.charAt(i) == '2') t++;

                // Create the difference pair (z - o, z - t)
                String diff = (z - o) + "," + (z - t);

                // If this pair has been seen before, add its frequency to the count
                cnt += mp.getOrDefault(diff, 0);
                mp.put(diff, mp.getOrDefault(diff, 0) + 1);
            }

            return cnt;
        }

        public static void main(String[] args) {
            String s = "102100211";
            System.out.println(countSubstrs(s));
        }
}
