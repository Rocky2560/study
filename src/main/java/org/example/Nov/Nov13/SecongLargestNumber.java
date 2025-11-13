package org.example.Nov.Nov13;

import java.util.Arrays;

public class SecongLargestNumber {
//    Given an array of positive integers arr[] of size n, the task is to find second largest distinct element in the array.
//
//Note: If the second largest element does not exist, return -1.
//
//Examples:
//
//Input: arr[] = [12, 35, 1, 10, 34, 1]
//Output: 34
//Explanation: The largest element of the array is 35 and the second largest element is 34.
//
//Input: arr[] = [10, 5, 10]
//Output: 5
//Explanation: The largest element of the array is 10 and the second largest element is 5.
//
//Input: arr[] = [10, 10, 10]
//Output: -1
//Explanation: The largest element of the array is 10 there is no second largest element.


    public static void main(String[] args) {
        int [] in = {10, 5, 10};
        System.out.println(secondLargest(in));
        System.out.println(secondLargestWay(in));
        System.out.println(secondLargestOtherWay(in));
    }

    private static int secondLargestWay(int[] in) {
        int length = in.length;
        int largest =-1, secondLargest =-1;
        for (int i = 0; i < length; i++) {
            if (in[i]> largest ) largest = in[i];

        }
        for (int j = 0; j < length; j++) {
            if (in[j]< largest &&  in[j]> secondLargest) secondLargest = in[j];
        }
        return secondLargest;

    }

    private static int secondLargestOtherWay(int[] in) {
        int length = in.length;
        int largest =-1, secondLargest =-1;
        for (int i = 0; i < length; i++) {
            if (in[i]> largest ) {secondLargest=largest; largest = in[i];}
            else if (in[i]< largest &&  in[i]> secondLargest){ secondLargest = in[i];}
        }
        return secondLargest;

    }


    //Time complexity (O(nlog(n))), Space complexity: O(1)
    private static int secondLargest(int[] in) {
        Arrays.sort(in);
        int length = in.length;
        for (int i=length-2; i >= 0; i--)
        {
            if (in[i] != in[length-1])
            {
                return in[i];
            }
        }
        return -1;
    }


}
