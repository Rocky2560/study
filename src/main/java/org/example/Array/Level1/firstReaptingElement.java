package org.example.Array.Level1;

import java.util.HashSet;

public class firstReaptingElement {

    static int firstRepeatingNumber(int [] a)
    {
        HashSet<Integer> res = new HashSet<>();
        for (int x: a)
        {
            if(!res.contains(x))
                res.add(x);
            else
                return x;
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] a = {1,5,5,6,6,7,8,9,7,8};
        int i = firstRepeatingNumber(a);
        System.out.println(i);
    }
}
