package org.example.geeks;

import java.util.Arrays;

public class missingRepetative {

    //Visting Method
    public static void  visitedMethod(int [] a)
    {
        int n = a.length;
        boolean [] temp = new boolean[n+1];
        Arrays.fill(temp, false);
        for (int i = 0; i <n ; i++) {
            if (temp[a[i]] == false)
            {
                temp[a[i]] = true;
            }
            else {
                System.out.println(a[i] + " is the repeating number");
            }

        }
        for (int j=1; j<n+1 ; j++)
        {
         if (temp[j] == false)
         {
             System.out.println(j + " is the msiign number");
         }
        }

    }

    //Inb place Sum formaules
    public static void inPlaceMethod(int [] a)
    {
        int n = a.length;
        int missing = (n*(n+1)/2);
        System.out.print("Repeating is ");
        for (int i =0; i< n; i++)
        {
            int abs = Math.abs(a[i]);
            if (a[abs-1] > 0)
            {
                a[abs -1] = -a[abs-1];
                missing -= abs;
            }
            else
            {
                System.out.println(abs);
            }
        }
        System.out.println("Missing is "+ missing);
    }

    //Math techniques
    public static void mathMethod(int[] a)
    {
        int x=0, y=0;
        int n = a.length;
        long sum = (long)(n*(n+1)/2);
        long ssSum = (long)((n*(n+1)*(2*n+1))/6);
        for (int i=0; i<n ; i++)
        {
            sum -= a[i];
            ssSum -= (long)a[i]*a[i];
        }
        long missing =0 , repeating = 0;
        missing =  (sum + ssSum/sum) / 2;
        repeating = missing - sum;

        System.out.println("Repeating number is "+ repeating);
        System.out.println("Missing number is " + missing);
    }

    public static void main(String[] args) {
        int[] arr = { 7, 3, 4, 5, 5, 6, 2 };
        int[] b = {4, 3, 6, 2, 1, 6, 7};
        visitedMethod(arr);
        inPlaceMethod(arr);
        mathMethod(b);
    }
}
