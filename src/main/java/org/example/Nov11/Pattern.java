package org.example.Nov11;

public class Pattern {


//    You are given a number n. You need to generate and print a pattern based on the given value of n.
//
//    For each row, starting from the first, print numbers in descending order from n down to 1.
//    Each number in a row is repeated as many times as the current row index (starting from n).
//    Instead of printing each row on a new line, separate rows with -1.
//    Instead of a newline at the end of each row, print -1 to indicate row separation. After printing the entire pattern, end the output with -1.
//
//    For n= 3,
//    pattern:  3 3 3 2 2 2 1 1 1
//            3 3 2 2 1 1
//            3 2 1
//
//    For n= 2,
//    pattern:  2 2 1 1
//            2 1
//}

    public static void main(String[] args) {
        int n=3;
        for (int i = n; i >= 1; i--) {  //row repition
            for (int j = n; j >= 1; j--) {  /// Numbers fron n down to 1
                for (int k = 0; k < i; k++) {
                    System.out.print(j +" " );
                }

            }
            System.out.print(-1+" ");
        }
    }
}
