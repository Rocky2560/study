package org.example.Dec.Dec5;

//Given a matrix mat[][] and an integer x, the task is to check if x is present in mat[][] or not. Every row and column of the matrix is sorted in increasing order.
//
//Examples:
//
//Input: x = 62, mat[][] = [[3, 30, 38],
//                                        [20, 52, 54],
//                                        [35, 60, 69]]
//Output: false
//Explanation: 62 is not present in the matrix.
//
//Input: x = 55, mat[][] = [[18, 21, 27],
//                                          [38, 55, 67]]
//Output: true
//Explanation: mat[1][1] is equal to 55.
//
//Input: x = 35, mat[][] = [[3, 30, 38],
//                                        [20, 52, 54],
//                                        [35, 60, 69]]
//Output: true
//Explanation: mat[2][0] is equal to 35.

public class matrixSearch {

    public static void main(String[] args) {
        int[][] mat = {{3, 30, 38},
                {20, 52, 54},
                {35, 60, 69}};
        int x = 35;

        if(matSearch(mat, x))
            System.out.println("true");
        else
            System.out.println("false");

        if(matSearchOptimal(mat, x))
            System.out.println("true");
        else
            System.out.println("false");
    }

    private static boolean matSearch(int[][] mat, int x) {
        int t=-1,y=-1, n = mat.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i+1; j++) {
                if (mat[i][j] == x) return true;
            }

        }
        return false;
    }

    private static boolean matSearchOptimal(int[][] mat, int x) {
        int i =0,n = mat.length, m = mat[0].length, j = m-1;
       while (i < n && j >=0 )
       {
           if (x > mat[i][j]) i++;
           else if (x < mat[i][j]) j--;
           else return true;
       }
        return false;
    }
}
