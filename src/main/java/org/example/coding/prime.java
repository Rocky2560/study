package org.example.coding;

public class prime {
public static void main(String args[])
    {
        int n = 13;
        if (n<=1)
        {
            System.out.println("It is not a preime number");
        }
        if (n==2)
        {
            System.out.println("It is prime number");
        }
        int count = 0;

        for (int i= 2; i<= n / 2; i++)
        {
            if (n % i == 0)
            {
               count++;
            }
        }
        if (count>=1)
        {
            System.out.println("Not Prime number");
        }
        else
        {
            System.out.println("Prime number");
        }
    }
}
