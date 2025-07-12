package org.example.interview;

import java.util.Scanner;

public class swapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first numebr: ");
        int in = sc.nextInt();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter the second number: ");
        int in1 = sc.nextInt();

        in = in+in1;
        in1 = in-in1;
        in = in-in1;

        System.out.println("The swapped number is "+ in + " "+ in1);
        sc.close();





    }
}
