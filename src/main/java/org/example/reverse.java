package org.example;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        StringBuilder r = new StringBuilder(input);
        if (input.equals(r.reverse().toString()))
        {
            System.out.println("palindorme");
        }
        else
        {
            System.out.println("Not palindorme");
        }

    }

    {

    }


}
