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
    }
}
