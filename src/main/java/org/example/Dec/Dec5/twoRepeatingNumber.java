package org.example.Dec.Dec5;

import java.util.Map;

public class twoRepeatingNumber {


    public static void main(String[] args)
    {
        twoRepeatingNumber repeat = new twoRepeatingNumber();
        int arr[] = { 4, 2, 4, 5, 2, 3, 1 };
        int ans[] = repeat.twoRepeated(arr);
        System.out.println(ans[0]+" "+ans[1]);
    }

    private int[] twoRepeated(int[] arr) {
        int size = arr.length;
        int S =0;
        int P= 1;
        int x,y;
        int D;
        int n = size-2, i;

        for (int j = 0; j < size; j++) {
            S += arr[j];
            P *= arr[j];
        }
        S = S - n*(n+1)/2;
        P /= fact(n);

        D = (int) Math.sqrt(S*S - 4*P);
        x = (D + S)/2;
        y = (S - D)/2;
        int ans[] = {x,y};
        return ans;
    }

    private int fact(int n)
    {
        return n==0?1:n*fact(n-1);
    }
}
