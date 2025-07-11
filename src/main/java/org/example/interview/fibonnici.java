package org.example.interview;

import java.util.Scanner;

public class fibonnici {
    public static void main(String[] args) {
        int a =0, b =1;
        int c = a + b;
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();
        for (int i=0; i<in; i++)
        {
            System.out.print(a + " ");
            a = b;
            b = c;
            c = a+b;
        }

    }
}
