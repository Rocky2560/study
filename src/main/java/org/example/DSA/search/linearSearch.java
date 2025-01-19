package org.example.DSA.search;

public class linearSearch {

    public static int linearSearch(int[] a, int n, int x)
    {
        for (int i=0; i<n; i++)
        {
            if (x == a[i])
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] a ={1,2,3,4};
        int x =linearSearch(a,a.length-1,3);
        System.out.println(x);

    }
}
