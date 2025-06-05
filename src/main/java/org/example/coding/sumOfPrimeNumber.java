package org.example.coding;

public class sumOfPrimeNumber {

    public static boolean isPrime(int n)
    {
        if (n <= 1)
        {
            return false;
        }
        for (int i=2; i <= Math.sqrt(n); i++)
            {
                if (n % i ==0)
                {
                    return false;
                }
            }

        return true;
    }

    public static void main(String[] args) {
        int op = 0;
        for (int i=1; i<=5; i++)
        if (isPrime(i))
        {
            op += i;
        }
        System.out.println(op);
    }
}
