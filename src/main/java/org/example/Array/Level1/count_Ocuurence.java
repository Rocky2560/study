package org.example.Array.Level1;

public class count_Ocuurence {

    //Naive Approach
    static void check(int [] a, int target)
    {
        int res = 0;
        for (int i=0;i<a.length;i++)
        {
            // If the current element is equal to
            // target, increment the result
            if (a[i] == target)
            {
                res++;
            }
        }
        System.out.println(res);
    }

    //Binary search Approach
    static int lowerBound(int [] a, int target)
    {
        int res = a.length;
        int left =0, right = a.length-1;
        while (left<=right)
        {
            int mid = (left+(right-left))/2;
            if (a[mid] >= target)
            {
                res = mid;
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }

        }
        return res;
    }

    static int upperBound(int [] a, int target)
    {
        int res = a.length;
        int left =0, right = a.length-1;
        while (left<=right)
        {
            int mid = left +(right - left)/2;
            if (a[mid] > target) {
                res = mid;
                right = mid - 1;
            }
            else {
                left = mid+1;
            }

        }
        return res;
    }


    static void checkSearch(int [] b, int target)
    {
        System.out.println(upperBound(b, target) - lowerBound(b, target));
    }

    public static void main(String[] args) {
        int[] a = {7,7,34,4,7,70};
        int[] b = {7,7,7,7,34,70};
        int target = 7;
        check(a,target);
        checkSearch(b, target);

    }
}
