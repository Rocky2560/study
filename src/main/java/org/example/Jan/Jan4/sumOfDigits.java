package org.example.Jan.Jan4;

public class sumOfDigits {

    // Driven Program to check above
    public static void main(String args[])
    {
        int num = 12345;
        int result = sum_of_digit(num);
        System.out.println(result);
    }

    private static int sum_of_digit(int num) {
        if (num == 0) return 0;
        return (num%10 + sum_of_digit(num/10));
    }
}
