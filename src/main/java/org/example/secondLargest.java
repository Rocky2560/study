package org.example;

import java.util.Arrays;

public class secondLargest {
    public static void main(String[] args) {
        int [] a ={1,2,3,4};
        System.out.println(highest(a));
    }
    static int highest(int[] a)
    {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i: a)
        {

            if (i> max)
            {
              min = max;
              max = i;
            }
            else if(i> min)
            {
                min = i;
            }
        }
        return min;
    }
}
