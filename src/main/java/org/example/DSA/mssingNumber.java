package org.example.DSA;

public class mssingNumber  {

    static void missingNumber(int [] a, int n)
    {

        int sum = (n*(n+1)) /2;
        for (int i=0; i<n-1; i++)
        {
            sum = Math.abs(sum - a[i]);
        }
        System.out.println(sum);
    }

    static void printArray(int [] a)
    {
        for (int x: a)
        {
            System.out.print(x + " ");

        }
    }
    public static void main(String[] args) {
        int [] a = {1,2,3,5,6};
        int n = a.length+1;
        missingNumber(a, n);
//        printArray(a);
    }
}
