package org.example.Dec.Dec18;

import java.util.ArrayList;
import java.util.List;

//Given two sorted arrays a[] and b[], where each array may contain duplicate elements , the task is to return the elements in the union of the two arrays in sorted order.
//Union of two arrays can be defined as the set containing distinct common elements that are present in either of the arrays.
//
//Examples:
//
//Input: a[] = [1, 2, 3, 4, 5], b[] = [1, 2, 3, 6, 7]
//Output: [1, 2, 3, 4, 5, 6, 7]
//Explanation: Distinct elements including both the arrays are: 1 2 3 4 5 6 7.
//Input: a[] = [2, 2, 3, 4, 5], b[] = [1, 1, 2, 3, 4]
//Output: [1, 2, 3, 4, 5]
//Explanation: Distinct elements including both the arrays are: 1 2 3 4 5.
//Input: a[] = [1, 1, 1, 1, 1], b[] = [2, 2, 2, 2, 2]
//Output: [1, 2]
//Explanation: Distinct elements including both the arrays are: 1 2.
//Constraints:
//1  ≤  a.size(), b.size()  ≤  105
//-109 ≤ a[i], b[i] ≤109

public class UnionSortedArrays {


    public static void main(String[] args) {
        int[] a = {2, 2, 3, 4, 5};
        int[] b = {1, 1, 2, 3, 4};

        System.out.println(union(a, b)); // [1, 2, 3, 4, 5]
    }

    public static List<Integer> union(int[] a, int[] b) {
        List<Integer> result = new ArrayList<>();

        int i=0, j=0;
        int n = a.length, m=b.length;

        while (i< n && j<m)
        {
            // Skip duplicates in array a
            if (i>0 && a[i] == a[i-1])
            {
                i++;
                continue;
            }
            if (j>0 && a[j] == a[j-1])
            {
                j++;
                continue;
            }

            if (a[i] < b[j])
            {
                result.add(a[i]);
                i++;
            } else if (a[i] > b[j]) {
                result.add(b[j]);
                j++;

            }
            else
            {
                result.add(b[j]);
                i++;
                j++;
            }
        }

        while(i < n)
        {
            if (i == 0 || a[i] != a[i-1])
            {
                result.add(a[i]);
            }
            i++;
        }

        while(j < m)
        {
            if (j == 0 || a[j] != a[j-1])
            {
                result.add(a[i]);
            }
            j++;
        }
        return result;
    }

}
