package org.example.DSA;

public class matrixCircular {
    public void spiralPrint(int [][] a, int r, int c)
    {
        int i, k=0, l=0;
        while (k<r && l<c)
        {
            for(i=l; i<c; i++)
                System.out.println(a[k][i] + " ");
            k++;

            for (i=k; i<r ; i++)
                System.out.println(a[i][c-1]);
            c--;

//            for ()
        }

    }

    public static void main(String[] args) {

    }
}
