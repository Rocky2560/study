package org.example.DSA.sorting;

public class selectionsort {

    public void sort(int [] a)
    {
        int n = a.length;
        for (int i = 0; i < n-1; i++) {

        int min = i;
        for(int j = i+1; j<n; j++)
        {
            if (a[j]<a[min])
            {
                min = j;
            }
        }
        int temp = a[min];
        a[min] = a[i];
        a[i] = temp;

        }
    }
    public void print (int [] a)
    {
        for (int x:a)
        {
            System.out.println(x);
        }
    }
    public static void main(String[] args) {
        int [] a = {2,4,9,1,22};
        selectionsort selectionsort = new selectionsort();
        selectionsort.sort(a);
        selectionsort.print(a);

    }
}
