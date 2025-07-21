package org.example.interview;

import java.util.Scanner;

/**
 * You are given a number n. You need to generate and print a pattern based on the given value of n.
 *
 * For each row, starting from the first, print numbers in descending order from n down to 1.
 * Each number in a row is repeated as many times as the current row index (starting from n).
 * Instead of printing each row on a new line, separate rows with -1.
 * Instead of a newline at the end of each row, print -1 to indicate row separation. After printing the entire pattern,
 * end the output with -1.
 * **/

public class print_pattern {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int i=1; i<=n; i++)
    for (int j=1; j<=n; j++)
    {
        System.out.println(j);
        break;
    }
    }
}
