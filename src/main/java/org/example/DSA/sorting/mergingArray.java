package org.example.DSA.sorting;

public class mergingArray {

    public static void mergerArray(int [] a, int[] b, int m, int n)
    {
        int c[] = new int[m+n];
        int i=0, j=0, k=0;
        while (i<m && j<n)
        {
            if (a[i] < b[j])
            {
                c[k] = a[i];
                i++;
            }
            else
            {
                c[k] = b[j];
                j++;
            }
            k++;
        }
        while (i<n)
        {
            c[k] = a[i];
            i++; k++;
        }

        while(j<n)
        {
            c[k] = a[j];
            j++;
            k++;
        }

        for (int x:c)
        {
            System.out.println(x);
        }
    }
    public static void main(String[] args) {
        int [] a = {2,3,4};
        int [] b = {1,3};
        int i = a.length;
        int j = b.length;
        mergerArray(a,b,i, j);
    }
}
