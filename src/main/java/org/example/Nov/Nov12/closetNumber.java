package org.example.Nov.Nov12;

public class closetNumber {
    public static void main(String[] args) {
        int n=-15, m=6;

        int q = n/m;

        int n1= m*q;

        int n2 = (m>0) ? m* (q+1) : m * (q-1);

        if (Math.abs(n - n1) < Math.abs(n - n2))
            System.out.println(n1);
        else if (Math.abs(n-n1)> Math.abs(n-n2))
            System.out.println(n2);
        else
            System.out.println(Math.abs(n1)>Math.abs(n2)?n1:n2);
    }
}
