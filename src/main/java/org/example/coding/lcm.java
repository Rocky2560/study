package org.example.coding;

public class lcm {

    public static int gcd(int a, int b)
    {
        while (b !=0)
        {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int lcm (int a, int b)
    {
        int n = (Math.abs(a * b)) / gcd(a, b);
        return n;
    }

    public static void main(String[] args) {
        int b=9, a=3;
        System.out.println(gcd(a,b));
        System.out.println(lcm(a, b));
    }
}
