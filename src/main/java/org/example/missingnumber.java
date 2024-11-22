package org.example;

public class missingnumber {
    public static void main(String[] args) {
        int [] n = {1,2,4,5};
        int [] hash = new int[n.length+1];
        for(int i=0 ; i<n.length-1; i++)
        {
            hash[n[i]]++;
        }
        for (int i=1; i<=n.length; i++)
        {
            if (hash[i] == 0)
            {
                System.out.println(i);
            }

        }
        int sum =0;
        for (int j=0; j<n.length-1; j++)
        {
            sum += n[j];
        }
        int actualsum = (n.length*(n.length+1))/2;
        System.out.println(actualsum-sum);

        int xor1 = 0, xor2 = 0;
        for (int q=0; q<n.length-1; q++)
        {
            xor1 ^= n[q];
        }

        for (int i=1; i<=n.length; i++)
        {
            xor2 ^= i;
        }
        System.out.println(xor1^xor2);
    }
}
