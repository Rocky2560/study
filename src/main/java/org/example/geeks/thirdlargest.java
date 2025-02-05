package org.example.geeks;

import java.util.ArrayList;
import java.util.List;

public class thirdlargest {

    public List<Integer> largest (int [] a)
    {
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE, third = Integer.MIN_VALUE;
        for (int x : a)
        {
            if (x> first)
            {
                third = second;
                second = first;
                first = x;
            }
            else if (x > second && x != first)
            {
                third = second ;
                second = x;
            }
            else if (x > third && x != second && x != first)
            {
                third = x ;
            }
        }

        List<Integer> op = new ArrayList<Integer>();
        op.add(first);
        op.add(second);
        op.add(third);
        return op;
    }
    public static void main(String[] args) {
        int[] a = {2,5,1 ,9,8,10};
        thirdlargest thirdlargest = new thirdlargest();
        List <Integer> op = thirdlargest.largest(a);
        for (int x: op)
        {
            System.out.println(x);
        }

    }
}
