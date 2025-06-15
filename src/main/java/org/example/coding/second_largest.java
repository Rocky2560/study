package org.example.coding;

public class second_largest {

    public static void main(String[] args) {
        int [] a = {2,5,6,8};
        int max = 0, smax = Integer.MIN_VALUE;

        for (int i=0; i<a.length; i++)
        {
            if (max < a[i])
                max = a[i];
        }
        int secondMax = Integer.MIN_VALUE;
        for (int x: a)
        {
            if (max != x)
            {
                if (secondMax < x)
                {
                    secondMax = x;
                }
            }

        }
        System.out.println(secondMax);
    }
}
