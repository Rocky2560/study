package org.example.Nov.Nov17;

import java.util.Arrays;

public class ProductArray {

    
    public static void main(String[] args) {
        int [] result = {1,2,3,4};
        int [] op = (productExceptSelf(result));
        for (int x:op)
        {
            System.out.println(x);
        }
    }

    private static int[] productExceptSelf(int[] result) {
        int [] results = new int[result.length];

        Arrays.fill(results, 1);
        int pre=1, post=1;

        for (int i = 0; i < result.length; i++) {
            results[i] = pre;
            pre *= result[i];
        }

        for (int i = result.length-1; i >= 0; i--) {
            results[i] *= post;
            post *= result[i];
        }
        return results;
    }
}
