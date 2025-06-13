package org.example.coding;

public class max_min_array {

    public static void maxArray(int[] a)
    {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i=0; i<a.length; i++)
        {
            max = Math.max(max, a[i]);
            min = Math.min(min, a[i]);
        }
        System.out.println(max +" "+min);
    }

    public static void main(String[] args) {
        int [] a = {3,5,6,70};
        maxArray(a);
    }
}
