package org.example.Nov.Nov25;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 1, 3, 5, 1};
        System.out.println(majorityElement(arr));
        System.out.println(majorityElementSorting(arr));
        System.out.println(majorityElementMoores(arr));
        int[] arr1 = {1, 1, 2, 1, 3, 5, 1};
        System.out.println(majorityElementHashing(arr1));
    }

    private static int majorityElement(int[] arr) {
        int n = arr.length;
        int count =0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[i] == arr[j]) { count++;}

            }
            if (count > n/2){return arr[i];}

        }
        return -1;
    }

    private static int majorityElementSorting(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int count =0;
        int candiate = arr[n/2];
        for (int i = 0; i < n; i++) {

                if (arr[i] == candiate) { count++;}

            if (count > n/2){return candiate;}

        }
        return -1;
    }

    private static int majorityElementHashing(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int count =0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i: arr) {
            map.put(i, map.getOrDefault(i,0)+1);

            if(map.get(i) > n/2) return i;

        }
        return -1;
    }

    private static int majorityElementMoores(int[] arr) {
//        Arrays.sort(arr);
        int n = arr.length;
        int count =0, candidate = -1;

        for (int num:arr)
        {
            if (count == 0)
            {
                candidate = num;
                count = 1;
            }
            else if (num == candidate){ count++;}
            else {count--;}
        }

        count =0;
        for (int x: arr)
        {
            if (x==candidate) count++;
        }

        if (count > n/2) return candidate;
        else return -1;
    }


}
