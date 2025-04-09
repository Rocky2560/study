package org.example.coding;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int n = 372, a = 372;
        int rem, sum = 0;
        while (n > 0) {
            rem = n % 10;
            sum += Math.pow(rem, 3);
            n /= 10;
        }

        System.out.println(sum);

        if (a == sum)
        {
            System.out.println("It is armstrong number");
        }
        else
        {
            System.out.println("It is not armstrong number");
        }
    }

}