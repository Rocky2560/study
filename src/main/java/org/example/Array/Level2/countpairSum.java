package org.example.Array.Level2;

public class countpairSum {

    //Naive Approach
    static boolean countPairs(int [] a, int target)
    {
        int count = 0;
        for (int i=0; i<a.length ; i++)
        {
            for (int j = i+1; j<a.length; j++)
            {
                if ((a[i]+a[j]) == target)
                {
                    count++;
                }
            }
        }

        System.out.println(count);
        return true;
    }

    //Two pointer approach
    static void countPointer(int [] a, int tar)
    {
        int count = 0;
        int i=0, j=a.length - 1;
        while ( i <= j)
        {
            if (a[i] + a[j] == tar)
            {
                count++;
                j--;
            }
            else if (a[i] + a[j] < tar)
            {
                i++;
            }
            else
            {
                j--;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 5, 7, -1, 5 };
        int target = 6;
        System.out.println(countPairs(arr, target));
        countPointer(arr, target);
    }
}
