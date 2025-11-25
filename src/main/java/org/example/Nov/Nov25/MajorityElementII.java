package org.example.Nov.Nov25;

import java.util.ArrayList;

public class MajorityElementII {
    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 1, 3, 2, 1, 1};
        ArrayList<Integer> res = findMajority(arr);
        for (int ele : res) {
            System.out.print(ele + " ");
        }
    }

    private static ArrayList<Integer> findMajority(int[] arr) {
        int ele1 = -1, ele2= -1;
        int n = arr.length;
        int cnt1=0, cnt2=0;

        for (int x: arr)
        {
            if (x == ele1) cnt1++;
            else if (x == ele2) cnt2++;
            else if (cnt1 == 0){ ele1 = x; cnt1++;}
            else if (cnt2 == 0) {ele2 = x; cnt2++; }
            else {cnt1--; cnt2--;}
        }

        ArrayList<Integer> arrayList = new ArrayList<>();
        cnt1 =0; cnt2=0;
        for (int y: arr)
        {
            if (y == ele1) cnt1++;
            if (y == ele2) cnt2++;
        }

        if (cnt1 > n/3) arrayList.add(ele1);
        if (cnt2 > n/3 && ele1 != ele2) arrayList.add(ele2);

        // Sort the result if needed
//        if (arrayList.size() == 2 && arrayList.get(0) > arrayList.get(1)) {
//            int temp = arrayList.get(0);
//            arrayList.set(0, arrayList.get(1));
//            arrayList.set(1, temp);
//        }

        return arrayList;
    }
}
