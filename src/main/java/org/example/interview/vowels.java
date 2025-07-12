package org.example.interview;

import java.util.Scanner;

public class vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in = sc.next().toLowerCase();

        switch(in)
        {
            case "a" :
                System.out.println("its is vowel");
                break;

            case "e" :
                System.out.println("its is vowel");
                break;


            case "o" :
                System.out.println("its is vowel");
                break;

            case "i" :
                System.out.println("its is vowel");
                break;

            case "u" :
                System.out.println("its is vowel");
                break;

            default:
                System.out.println("its is consonent");
                break;

        }
    }
}
