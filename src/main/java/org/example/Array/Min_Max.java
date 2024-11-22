package org.example.Array;

public class Min_Max {
    public static int min(int[] a)
    {
        int mini = Integer.MAX_VALUE;
        for (int i=0; i<a.length; i++)
        {
            if (a[i] < mini)
            {
                mini = a[i];
            }
        }
        return mini;
    }

    public static int max(int[] a)
    {
        int max = Integer.MIN_VALUE;
        for (int i=0; i<a.length;i++)
        {
            if (a[i] > max)
            {
                max = a[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int [] a = {2,1,8,9,10,109};
        System.out.println(max(a));
        System.out.println(min(a));
        System.out.println();
    }
}
