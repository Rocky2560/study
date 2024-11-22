package org.example;

public class max_subarray {
    public static void main(String[] args) {
        int [] n = {2, 3, -8, 7, -1, 2, 3};
        int max = n[0];
        int length = n.length;
        for (int i =1 ; i< length; i++)
        {
            int currentSum = 0;
            for (int j=i; j<length; j++)
            {
                currentSum += n[j];
                max = Math.max(currentSum, max);
            }
        }
        System.out.println(max);

        //Kadene's Algorithm
        int res=n[0], maxx = n[0];
        for (int k=1; k<length; k++)
        {
            maxx = Math.max(maxx+n[k],n[k]);
            res = Math.max(maxx, res);

        }
        System.out.println(res);
    }
}
