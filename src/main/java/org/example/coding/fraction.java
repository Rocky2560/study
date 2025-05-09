package org.example.coding;

public class fraction {

    public static int gcd (int a, int b)
    {
        while (b != 0)
        {
            int tem = b;
            b = a % b;
            a = tem;
        }
        return a;
    }

    public static void main(String[] args) {

        int num1 = 1;
        int den1 = 4;
        int num2 = 1;
        int den2 = 4;

        int rnum = num1*den2 + num2*den1;
        int rden = den2*den1;

        int gdc = gcd(rnum, rden);
        rnum /= gdc;
        rden /= gdc;


        System.out.println(rnum+ "/"+ rden);
    }
}
