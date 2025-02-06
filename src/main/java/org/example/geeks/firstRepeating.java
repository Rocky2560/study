package org.example.geeks;

import java.util.HashSet;

public class firstRepeating {

    //LOop approach
    public static int loopMethod(int [] a)
    {
    int n = a.length;
    for(int i=0; i< n; i++)
    {
        for (int j=1; j<n; j++)
        {
            if (a[i] == a[j])
            {

               return a[i];
            }
        }
    }
    return -1;
    }

    //Hashset approach
    public static int hashmethod(int [] a)
    {
        HashSet<Integer> hashSet = new HashSet<>();
        int n = a.length;
        for(int i=0; i< n; i++)
        {
            if (hashSet.contains(a[i]))
            {
                return a[i];
            }
            else
            {
                hashSet.add(a[i]);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = { 10, 5, 3, 4, 3, 5, 6 };
        int op = loopMethod(a);
        System.out.println(op + " is the first repeatating number");

        int op2 = hashmethod(a);
        System.out.println(op2 + " is the first repeatating number");
    }
}
