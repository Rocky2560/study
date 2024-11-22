package org.example;

public class bubblesort {
    public static void main(String[] args) {
        int [] n = {3, 1, 9, 8, 5};
        int temp;
        for (int i =0 ; i<n.length-1; i++)
        {
            for (int j=0; j<n.length-i-1; j++)
            {
                if (n[j]> n[j+1])
                {
                 temp = n[j];
                 n[j] = n[j+1];
                 n[j+1] = temp;
                }
            }
        }
        for (int k = 0; k < n.length; k++)
            System.out.print(n[k] + " ");
    }
}
