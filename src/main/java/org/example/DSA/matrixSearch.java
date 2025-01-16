package org.example.DSA;

public class matrixSearch {

    public static void search(int[][] a, int x, int n) {
        int i = 0;

        int j = n - 1;
        while (i < n && j >= 0) {
            if (a[i][j] == x) {
                System.out.println("the number lies in " + i+"  "+ j);
                return;
            }

            if (a[i][j] > x)
            {
                j--;
            }
            else
            {
                i++;
            }
        }
        System.out.println("Not Found");
    }
    public static void main(String[] args) {
        int [] [] a ={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33, 39,51}};
        int n = a.length;
        int x = 29;
        search(a, x, n);
    }
}
