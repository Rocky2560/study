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

    public void optimizedSolution(int [] a, int diff)
    {
        int i=0, j=1;
        int n = a.length;
        while (i < n && j < n)
        {
            if ( i != j && (a[j] - a[i] == diff || a[i] - a[j] == diff))
            {
                System.out.println("Pair found"+ a[i] + a[j]);
            }
            else if (a[j] - a[i] < n)
                j++;
            else
                i++;
        }
        System.out.println("no such pair");
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
