package org.example.Dec.Dec31;

//Given a decimal number as input, we need to write a program to convert the given decimal number into an equivalent binary number.
//
//Examples :
//
//Input: d = 7
//Output: 111
//Explanation:  20 + 21  + 22 = 1+2+4 = 7.
//
//Input: d = 10
//Output: 1010
//Explanation: 21  + 23 = 2+8 = 10.

public class DecimalToBinary {
    // Driver code
    public static void main(String[] args) {
        int d = 10;
        System.out.println(decToBin(d));
    }

    private static int decToBin(int d) {
        if (d == 0) return 0;
        else return (d%2 + 10 * decToBin(d/2));
    }
}
