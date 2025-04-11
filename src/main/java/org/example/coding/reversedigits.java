package org.example.coding;

public class reversedigits {

    public static void main(String[] args) {
        int n = 12304;
        int sum =0;
        while (n>0)
        {
            sum = sum*10 + n%10;
            n /= 10;
        }
        System.out.println(sum);
    }
}
