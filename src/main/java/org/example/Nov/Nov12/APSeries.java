package org.example.Nov.Nov12;

public class APSeries {

    public static void main(String[] args) {
        int n =5;
        int a1=1, a2=3;
        int diff =a2-a1;
        System.out.print(a1 +" "+ a2+" ");
        for (int i =0; i<n-2; i++)
        {
            a2+=diff;
            System.out.print(a2 + " ");
        }


        for (int i = 0; i < n; i++) {
            System.out.print(a1 + i * diff + " ");
        }
    }
}
