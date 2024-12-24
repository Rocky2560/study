package org.example.DSA;

public class movingZero {
    static void moveZero(int[] a)
    {
        int n = a.length;
        int j =0;
        for (int i=0; i<n; i++)
        {
            if (a[i] != 0 && a[j] ==0)
            {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
            else if (a[j] !=0 )
            {
                j++;
            }
        }

    }
    static void printArray(int [] a)
    {
        for (int x: a)
        {
            System.out.print(x + " ");

        }
    }

    public static void main(String[] args) {
        int [] a = {1,0,5,6,0,9};
        moveZero(a);
        printArray(a);
    }
}
