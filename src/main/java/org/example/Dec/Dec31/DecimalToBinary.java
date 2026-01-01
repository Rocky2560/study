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

//Recursive Approach for Small Integers - O(log2n) Time and O(log2n) Space
//The function recursively divides the decimal number by 2, appending the remainder as the next binary digit, constructing the binary representation from right to left.
//
//For example
//
//To convert 10 to binary
//
//10 % 2 = 0, continue with 10 / 2 = 5
//5 % 2 = 1, continue with 5 / 2 = 2
//2 % 2 = 0, continue with 2 / 2 = 1
//1 % 2 = 1, stop as 1 / 2 = 0
//Reading remainders gives 1010 (binary).
