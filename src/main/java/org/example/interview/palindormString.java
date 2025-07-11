package org.example.interview;
import java.util.Scanner;

public class palindormString {

    public static void palindrome(String string)
    {
        StringBuilder stringBuilder = new StringBuilder(string);
        if (!stringBuilder.reverse().toString().equals(string))
        {
            System.out.println("The string is not palindrome");
        }
        else
        {
            System.out.println("It is palidnormes");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String in = sc.next();
        palindrome (in);
        sc.close();
    }
}
