package org.example.Array.Level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class duplicateArray {

    //Naive Approach
    static List<Integer> duplicate(int [] a)
    {
        List<Integer> output = new ArrayList<>();
        int n =a.length;
        for (int i=0;i<n-1 ;i++)
        {
            for (int j=i+1;j<n;j++)
            {
                if (a[i] == a[j]) {
                    if (!output.contains(a[i]))
                    {
                        output.add(a[i]);
                     }
                    break;
                }

            }
        }
        return output;
    }

    static int lowerBound(int[]a, int target)
    {
        int low =0, high =a.length;
        while(low<high)
        {
            int mid = (low+high)/2;
            if(a[mid] < target)
                low = mid+1;
            else
                high = mid;
        }
        return low;
    }
    static int upperBound(int[] a, int target)
    {
        int low=0, high=a.length;
        while (low<high)
        {
            int mid = low+high/2;
            if(a[mid] <= target)
            {
                low = mid+1;
            }
            else
                high = mid;
        }
        return low;
    }

    //Soritng the Array
    static List<Integer> duplicateSort(int[] a)
    {
        Arrays.sort(a);
        List<Integer> list = new ArrayList<>();
        int i=0;
        while (i<a.length)
        {
            int first = lowerBound(a,a[i]);

            int last = upperBound(a,a[i]) - 1;
            if (last>first)
            {
                list.add(a[i]);
                System.out.println(list);
            }
            i = last+1;
//           break;
        }
        System.out.println(list);
        return list;
    }

    //Print the list
    static void print(ArrayList<Integer> arr)
    {
       for (int x: arr)
       {
           System.out.println(x);
       }
    }
    public static void main(String[] args) {
        int[] a = {12, 11, 40, 12, 5, 6, 5, 12, 11};
        int[] b = {12, 11, 40, 12, 5, 6, 5, 12, 11};
        List <Integer> arrayList = duplicate(a);
        print((ArrayList<Integer>) arrayList);

        List<Integer> op = duplicateSort(b);
        print((ArrayList<Integer>) op);

    }
}
