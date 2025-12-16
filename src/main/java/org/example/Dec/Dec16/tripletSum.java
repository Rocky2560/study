package org.example.Dec.Dec16;

import java.util.Arrays;
import java.util.List;

public class tripletSum {

    // Driver Code with Predefined Input
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList( 3, 4, 5);

        if (findTriplet(arr))
            System.out.println("true");
        else
            System.out.println("false");
    }

    private static boolean findTriplet(List<Integer> arr) {

        Integer [] arra = arr.toArray(new Integer[0]);
        Arrays.sort(arra);
        int n = arr.size();

        for (int i = 2; i < n; i++) {
            int left =0, right=i-1;
            while (left < right)
            {
                int sum = arra[left]+arra[right];
                if (sum == arra[i]) return true;
                else if (sum < arra[i]) left++;
                else right--;
            }


        }
        return false;
    }
}
