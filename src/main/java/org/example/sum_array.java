package org.example;

import java.lang.reflect.Array;

public class sum_array {
    public static void main(String[] args) {
        int [] a = {1,2,3};
        int o =0;
        for (int i=0; i<a.length; i++)
        {
            o += a[i];
        }
        System.out.println(o);
    }
}
