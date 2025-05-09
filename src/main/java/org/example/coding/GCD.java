package org.example.coding;

public class GCD {
    public static int gcd(int a, int b) {
        // code here
        return (b == 0) ? a:gcd(b, a%b);
    }


    public static void main(String[] args) {
        int a =3, b=6;
        int op = gcd(a,b);
        System.out.println(op);

        int [] x = {2,4,6,8};
        int gcd = x[0];
        for (int i=1; i<x.length; i++)
        {
            gcd =  gcd(gcd,x[i]);
        }
        System.out.println(gcd);
    }
}
