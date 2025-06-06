package org.example.coding;

public class prefectsqaure {

    public static void perfectSqaure(int n)
    {
        int count =0;
    for (int i=1; i*i < n; i++)
    {
        count ++;
    }
        System.out.println(count);
    }

    public static void main(String[] args) {
        int n= 17;
        perfectSqaure(n);
    }
}
