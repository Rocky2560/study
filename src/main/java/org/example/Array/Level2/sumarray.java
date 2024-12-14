package org.example.Array.Level2;

import java.util.ArrayList;
import java.util.Arrays;

public class sumarray {

    //Naive Approach
    static ArrayList<Integer> subarraySum (int [] arr, long sum, int n)
    {
        //To store the result
        ArrayList<Integer> res = new ArrayList<>();

        //Flag to indicate the subarray is found
        boolean flag = false;

        for (int i=0; i<n; i++)
        {

            int currenSum = arr[i];

            //check if the single element is sum
            if (currenSum == sum)
            {
                res.add(i+1);
                res.add(i+1);
                flag = true;
                break;
            }

            else
            {
                for (int j = i+1; j < n; j++)
                {
                    currenSum += arr[j];

                    if (currenSum == sum)
                    {
                        res.add(i+1);
                        res.add(j+1);
                        flag = true;
                        break;
                    }
                }
                if (flag) break;
            }
        }
        if (flag)
                return res;

        res.add(-1);
        return res;
    }

    //Sliding Window
    static ArrayList subarraySum1(int [] arr, long sum, int n) {
        int last = 0;
        int start = 0;
        long curSum = 0;
        boolean flag = false;
        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            curSum += arr[i];

            if (curSum >= sum)
                last = i;

            while (sum < curSum && start < last) {
                curSum -= arr[start];
                ++start;
            }
            if (curSum == sum) {
                res.add(start + 1);
                res.add(last + 1);
                flag = true;
                break;
            }
        }

        if (!flag)
            res.add(-1);
    return res;
    }

    public static void main(String[] args) {
        int [] arr =  { 15, 2, 4, 8, 9, 5, 10, 23 };
        int n = arr.length;
        long sum = 15;
        ArrayList<Integer> result = subarraySum(arr, sum, n);
        ArrayList<Integer> result1 = subarraySum1(arr, sum, n);
        for (int i: result)
        {
            System.out.println(i + " ");
        }
        for (int i: result1)
        {
            System.out.println(i + " ");
        }
    }
}
