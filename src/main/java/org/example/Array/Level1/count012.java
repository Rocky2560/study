package org.example.Array.Level1;

import java.util.Arrays;

public class count012 {

    //Just counting 0's , 1's and 2's in the array and printing it
    static  void printOnly(int []a)
    {
        int n = a.length;
        int c1=0, c2=0, c3=0;
        for (int i=0; i<n; i++)
        {
            if(a[i] == 0)
            {
                c1 += 1;
            }
            else if (a[i] == 1)
            {
                c2 +=1;
            }
            else {
                c3 +=1;
            }
        }
        int idx = 0;
        for (int i = 0; i < c1; i++) {
            a[idx++] = 0;
        }

        for (int i = 0; i < c2; i++) {
            a[idx++] = 1;
        }

        for (int i = 0; i <c3 ; i++) {
            a[idx++] = 2;
        }
        addCount(c1, c2, c3);
        print(a);
    }

    //Sorting and Counting 0's, 1's, and 2's , also printing the arrays.
    static void sort (int[] a)
    {
    Arrays.sort(a);
    int c1=0, c2=0, c3 =0;
    for (int i=0; i<a.length; i++)
    {
        if (a[i]==0)
        {
            c1+=1;
        }
        else if(a[i]==1)
        {
            c2 +=1;
        }
        else
        {
            c3 += 1;
        }
    }

    addCount(c1, c2, c3);
    print(a);
    }

    //Dutch National Algorithm
    static void dutchSolution(int [] a)
    {
        int n = a.length -1;
        int lo =0, mid =0, hi=n;

        while (mid <= hi)
        {
            if(a[mid] == 0)
            {
                swap(a, mid, lo);
                lo++;
                mid ++;
            }
            else if(a[mid] == 1)
            {
                mid++;
            }
            else
            {
                swap(a, mid, hi);
                hi--;
            }
        }
        print(a);
    }

    //Swaping the elements
    static void swap(int [] a, int i, int j)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    //Count the numbers of 0,1 and 2's
    static void addCount (int c1, int c2, int c3)
    {
        System.out.println("The number of 0's is "+c1);
        System.out.println("The number of 1's is "+c2);
        System.out.println("The number of 2's is "+c3);
    }

    static void print(int [] a)
    {
        for (int x:a)
        {
            System.out.print(x + " ");
        }
    }
    public static void main(String[] args) {
        int[] a = { 0, 1, 2, 0, 1, 2 };
        int[] b = { 0, 1, 2, 0, 1, 2 };
        int[] c = { 0, 1, 2, 0, 1, 2 };
        sort(a);
        System.out.println();
        printOnly(b);

        System.out.println();
        dutchSolution(c);
    }
}
