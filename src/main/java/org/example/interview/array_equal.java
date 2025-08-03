package org.example.interview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;

public class array_equal {

    public static boolean checkArray(Object []a, Object [] b)
    {
        HashSet<Object> hashSet = new HashSet<>(Arrays.asList(a));
        HashSet<Object> hashSet1 = new HashSet<>(Arrays.asList(b));

        if (hashSet.size() != hashSet1.size()) {return false;}

        for (Object ob: hashSet)
        {
            if (!hashSet1.contains(ob)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Integer [] a = {1,2,3,1};
        Integer [] b = {1,2,3};
        System.out.println(checkArray(a,b));
        if(!checkArray(a,b))
        {
            System.out.println("It is not equals");
        }
        else
        {
            System.out.println("it is equal");
        }
    }
}
