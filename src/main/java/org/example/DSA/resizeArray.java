package org.example.DSA;

public class resizeArray {
    static void reArray(int[] a)
    {
        int [] temp = new int[2*a.length];
        for (int i = 0; i < a.length; i++) {
            temp[i] = a[i];
        }
        for (int x: temp)
        {
            System.out.print(x + " ");

        }
    }

    static void printArray(int [] a)
    {
        for (int x: a)
        {
            System.out.print(x + " ");

        }
    }
    public static void main(String[] args) {
        int [] a = {1,0,5,6,0,9};
        reArray(a);
//        printArray(a);
    }
}
