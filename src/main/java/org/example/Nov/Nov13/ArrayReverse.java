package org.example.Nov.Nov13;

import java.util.*;

public class ArrayReverse {
//    Reverse an array arr[]. Reversing an array means rearranging the elements such that the first element becomes the last, the second element becomes second last and so on.
//
//Examples:
//
//Input: arr[] = [1, 4, 3, 2, 6, 5]
//Output:  [5, 6, 2, 3, 4, 1]
//Explanation: The first element 1 moves to last position, the second element 4 moves to second-last and so on.
//
//Input: arr[] = [4, 5, 1, 2]
//Output: [2, 1, 5, 4]
//Explanation: The first element 4 moves to last position, the second element 5 moves to second last and so on.

    public static void main(String[] args) {
        int arr[] = {1, 4, 3, 2, 6, 5};
        int n = arr.length;
        int op[] = new int[arr.length];
        int j=0;
        for (int i = n-1; i >= 0; i--) {
            op[j] =arr[i];
            System.out.print(op[j]+" ");
            j++;
        }
        System.out.println(pointerApproach(arr, n));

        List<Integer> ar = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        reverseArrayInbuilt(ar);
        for (int i = 0; i < ar.size(); i++)
            System.out.print(ar.get(i) + " ");
    }
    public static int[] pointerApproach(int[] arr, int n)
    {
        int left=0, right =n-1;
        while (left < right)
        {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        for (int j = 0; j < n; j++) {
            System.out.print(arr[j]+" ");

        }
        return arr;
    }

    public static void reverseArrayInbuilt(List<Integer> arr)
    {
        Collections.reverse(arr);
    }
}
