package org.example.Array.Level2;

public class missinNumber {

    //Using Hashing
    static int missingnumber(int [] a)
    {
        int n = a.length+1;

        int[] result = new int[n+1];

        for (int i=0; i<a.length; i++)
        {
            result[a[i]]++;
        }
        for (int i=1; i<=n; i++)
        {
            if (result[i] == 0)
                 return i;
        }
       return -1;
    }

    //Using formaulae

    static int fmissingNumber(int [] a)
    {
        int n= a.length + 1;
        int actSum =0, expSum = 0;
        for (int i=0; i<n -1; i++)
        {
            expSum += a[i];
        }
        actSum = (n * (n+1))/2;


        return actSum-expSum;
    }

    public static void main(String[] args) {
        int [] a = {1,2,4,5};
        int n = missingnumber(a);
        System.out.println(n);
        int x = fmissingNumber(a);
        System.out.println(x);
    }
}
