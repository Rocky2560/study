package org.example.interview;

import java.util.Scanner;

public class factorial {

    public static int fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return (n * fact(n - 1));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number: ");
        int in = sc.nextInt();
        int x = fact(in);
        System.out.println("The factorial of "+in+ " is "+ x);
        sc.close();


    }
}
