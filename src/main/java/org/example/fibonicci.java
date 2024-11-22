package org.example;

import java.util.Scanner;

public class fibonicci {

    public static void main(String args[])
    {
//        int i = 5;

        int a=0, b=1;
        int c =a +b;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        System.out.print(a +" + "+b);
        for(int i=1; i<=n; i++)
        {
            System.out.print(a + " + ");
            a=b;
            b=c;
            c = a+b;

        }



    }


}
