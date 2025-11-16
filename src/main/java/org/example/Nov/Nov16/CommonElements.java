package org.example.Nov.Nov16;

import java.util.ArrayList;
import java.util.List;

//Given three sorted arrays in non-decreasing order, print all common elements in non-decreasing order across these arrays. If there are no such elements return an empty array. In this case, the output will be -1.
//
//Note: In case of duplicate common elements, print only once.
//
//Examples:
//
//Input: arr1[] = [1, 5, 10, 20, 30], arr2[] = [5, 13, 15, 20], arr3[] = [5, 20]
//Output: 5 20
//Explanation: 5 and 20 are common in all the arrays.
//
//Input: arr1[] = [2, 5, 10, 30], arr2[] = [5, 20, 34], arr3[] = [5, 13, 19]
//Output: 5
//Explanation: 5 is common in all the arrays.
public class CommonElements {

    public static void main(String[] args)
    {
        int[] arr1 = { 1, 5, 10, 20, 30 };
        int[] arr2 = { 5, 13, 15, 20 };
        int[] arr3 = { 5, 20 };

        List<Integer> common
                = commonElements(arr1, arr2, arr3);

        if (common.size() == 0)
            System.out.print(-1);
        for (int i = 0; i < common.size(); i++)
            System.out.print(common.get(i) + " ");
    }

    private static List<Integer> commonElements(int[] arr1, int[] arr2, int[] arr3) {
        List<Integer> op = new ArrayList<>();
        int i=0,j=0,k=0;
        while (i < arr1.length && j < arr2.length && k < arr3.length ) {
            if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
                op.add(arr1[i]);
                i++;
                j++;
                k++;

                while (i < arr1.length && arr1[i] == arr1[i - 1]) i++;
                while (j < arr1.length && arr1[j] == arr1[j - 1]) j++;
                while (k < arr1.length && arr1[k] == arr1[k - 1]) k++;
            } else if (arr1[i] <arr2[j]) i++;
            else if (arr1[j] <arr2[k]) j++;
            else k++;
            }
        return op;
        }
}
