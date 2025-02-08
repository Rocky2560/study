package org.example.geeks;

public class difference {

    public static void findPair(int[] a, int n, int diff)
    {
    for (int i =0; i<n ; i++)
    {
        for (int j=0; j<n; j++)
        {
            if (i == j)
            {
                continue;
            }
            if ((a[j]-a[i]) == diff)
            {
                System.out.println(a[i] +" "+ a[j]);
                return ;
            }
        }
    }
        System.out.println("No such pair");

    }

    public static void main(String[] args) {
        // Input array and diff
        int[] arr = { 1, 8, 30, 40, 100 };
        int n = arr.length;
        int diff = -60;

        // Function call
        findPair(arr, n, diff);
    }
}
