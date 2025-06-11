package org.example.coding;

import java.util.ArrayList;

public class evenprinting {
    // function to print alternate elements of an array
    public static ArrayList<Integer> getAlternates(int arr[]) {
        // Code Here
        ArrayList<Integer> op = new ArrayList<Integer>();
        for (int i=0; i<arr.length; i=i+2)
        {
            // System.out.println(arr[i]);
            op.add(arr[i]);
        }
        return op;
    }

    public static void main(String[] args) {
        int arr [] = {2,4,6,8};
        System.out.println(getAlternates(arr));
    }
}
