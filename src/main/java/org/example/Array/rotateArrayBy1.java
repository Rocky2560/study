package org.example.Array;

public class rotateArrayBy1 {

    //Using pointers
    static void rotatepointer(int[] a)
    {
        int l=0, r =a.length-1;
        while (l<=r)
        {
            int temp = a[l];
            a[l] = a[r];
            a[r] = temp;

            l++;

        }
    }

    static void rotateArray(int[] a)
    {
        int temp = a[a.length-1];

        for (int i=a.length-1; i>0; i--)
        {
            a[i] = a[i-1];
        }
        a[0] = temp;
    }

    static void print(int[] a)
    {
        for (int i=0; i<a.length; i++)
        {
            System.out.print(a[i] + " ");
        }
    }
    public static void main(String[] args) {

        int [] a = {2,8,5,3,99};
        int [] b = {2,8,5,3,99};
        int [] c = {2,8,5,3,99};

        rotateArray(a);
        print(a);

        System.out.println();
        rotatepointer(b);
        print(b);

    }
}
