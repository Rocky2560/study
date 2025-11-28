package org.example.Nov.Nov28;

//Given an array of positive numbers, calculate the number of possible contiguous subarrays having product lesser than a given number K.
//
//Examples :
//
//Input : arr[] = [1, 2, 3, 4]
//            K = 10
//Output : 7
//The subarrays are {1}, {2}, {3}, {4}, {1, 2}, {1, 2, 3} and {2, 3}
//
//
//
//Input  : arr[] = [1, 9, 2, 8, 6, 4, 3]
//             K = 100
//Output : 16
//
//
//
//Input  : arr[] = [10, 5, 2, 6]
//             K = 100
//Output : 8

import java.util.ArrayList;

public class ProdcutLessThenk {
    public static void main(String args[])
    {
        int array[] = { 1, 2, 3, 4 };
        int k = 10;
        int size = array.length;
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        System.out.println(
                countSubArrayProductLessThanK(al, 10));
    }

    private static int countSubArrayProductLessThanK(ArrayList<Integer> al, int k) {
        int res =0;
        int p=1;
        for (int start = 0, end=0; end < al.size(); end++) {
            p *= al.get(end);

            while (start < end && p >= k)
                p /= al.get(start++);
            if (p < k) {
                int len = end - start + 1;
                res += len;
            }
        }
        return res;
    }

}
