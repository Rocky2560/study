package org.example.interview;

import java.util.Scanner;

public class oddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int x = sc.nextInt();
        if ( x % 2 == 0)
        {
            System.out.println("its is even");
        }
        else
        {
            System.out.println("its is odd");
        }
        sc.close();
    }
}
