package org.example.coding;

import java.util.ArrayList;
import java.util.List;

public class arrayOperations {
    public static boolean searchEle(List<Integer> arr, int x) {
        // add code here.
        for (int y: arr)
        {
            if (y == x)
                return true;
        }
        return false;
    }

    public static void insertEle(List<Integer> arr, int y, int yi) {
     arr.set(y,yi);
     for (int t : arr)
     {
         System.out.println(t);
     }

    }

    public static void deleteEle(List<Integer> arr, int z) {
        // add code here.
        for (int r =0; r < arr.size(); r++)
        {
            if (arr.get(r) == z)
            {
                arr.remove(r);
            }
        }
        for (int t : arr)
        {
            System.out.println(t);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(4);
        arr.add(9);
        arr.add(5);

        System.out.print(searchEle(arr, 5));
        insertEle(arr, 3,3);
        deleteEle(arr, 3);



    }
}
