package org.example.interview;

import java.util.Arrays;

public class productArray {

    public static int[] product(int[] a) {
        int zeros = 0, product = 1, idx = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                zeros++;
                idx = i;
            } else {
                product *= a[i];
            }
        }

            int [] res = new int[a.length];
            Arrays.fill(res, 0);

            if (zeros == 0) {
                for (int j = 0; j < a.length; j++) {
                    res[j] = product / a[j];
                }

            } else if (zeros == 1) {
                res[idx] = product;
            }

        return res;
    }

    public static void main(String[] args) {
        int [] a = {2,4,6,8};
        int op[] = product(a);
        for(int x:op)
        {
            System.out.println(x);
        }
    }
}
