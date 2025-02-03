package org.example.geeks;

import java.util.Arrays;

public class largestNumber {


    //Built in functions
    public void maxNumberBuiltin(int [] a)
    {
        Arrays.sort(a);
        int n = a.length - 1;
        System.out.println(a[n]);
    }
    //Iterative Approach
    public void maxNumber (int [] a)
    {
        int max = a[0];
        for (int x: a)
        {
            if (x>max)
            {
                max = x;
            }
        }
        System.out.println(max);

    }

    //Recxursive approach
    public int findMax (int [] a , int i)
    {
        //Last index of the element
        if ( i == a.length - 1)
        {
            return a[i];
        }

        //Find the maximum from the rest of array
        int recMax = findMax(a, i+1);

        //Compare with i-th element  and returns
        return Math.max(recMax, a[i]);
    }

    public int larhgest (int [] a)
    {
        return findMax(a, 0);
    }

    public static void main(String[] args) {
        int [] a = {2,1,4,6};
        largestNumber largestNumber = new largestNumber();
        largestNumber.maxNumber(a);
        largestNumber.maxNumberBuiltin(a);
        System.out.println(largestNumber.larhgest(a));
    }
}
