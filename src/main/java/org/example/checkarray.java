package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class checkarray {

    public static void main(String[] args) {
        Integer [] a = {1,2,3,2,1};
        Integer [] b = {1,2,3};
        Integer [] c = {1,5,6};

        System.out.println(check(a,b));
    }
     static boolean check(Object[] a, Object [] b)
    {
        Set<Object> hashset = new HashSet<>(Arrays.asList(a));
        Set<Object> hashSet1 = new HashSet<>(Arrays.asList(b));

        if (hashset.size() != hashSet1.size())
        {
            return false;
        }

        for (Object obj: hashset)
        {
            if (!(hashSet1.contains(obj))) return false;
        }
        return true;
    }
}
