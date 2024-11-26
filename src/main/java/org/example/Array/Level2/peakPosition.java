package org.example.Array.Level2;

public class peakPosition {

    static int postion(int [] a , int n)
    {
        // First or last element is peak element
    if (n==1)
        return 0;
    if (a[0] >= a[1])
        return 0;
    if (a[n-1] >= a[n-2])
        return n-1;
        // Check for every other element
        for (int i = 1; i <n ; i++) {
            // Check if the neighbors are smaller
            if (a[i]>=a[i-1] && a[i]>=a[i+1])
            {
                return i;
            }

        }
        return 0;

    }

    public static void main(String[] args) {
        int a[] = { 1, 3, 20, 4, 1, 0 };
        int n = a.length;

        System.out.println("The position of the number is " + postion(a, n));
    }
}
