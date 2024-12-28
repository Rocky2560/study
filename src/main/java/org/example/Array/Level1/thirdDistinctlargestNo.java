package org.example.Array.Level1;

import java.util.ArrayList;
import java.util.List;

public class thirdDistinctlargestNo {

    static List<Integer> get2Largest(int []a)
    {
        List<Integer> res = new ArrayList<>();
        int l1=Integer.MIN_VALUE, l2=Integer.MIN_VALUE, l3=Integer.MIN_VALUE;
        for (int x: a)
        {
            if (x > l1)
            {
                l3 = l2;
                l2 = l1;
                l1 = x;
            }
            else if(x > l2 && x != l1)
            {
                l3 = l2;
                l2 = x;
            } else if (x>l3 && x != l2 && x != l1) {
                l3 = x;

            }
        }
        if (l1 == Integer.MIN_VALUE) return res;
        res.add(l1);
        if (l2 == Integer.MIN_VALUE) return res;
        res.add(l2);
        if (l3 == Integer.MIN_VALUE) return res;
        res.add(l3);
        return res;
    }


    public static void main(String[] args) {
        int [] a = {12, 13, 1, 10, 34, 1};
        List<Integer> res = get2Largest(a);
        for (int x: res)
        {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
