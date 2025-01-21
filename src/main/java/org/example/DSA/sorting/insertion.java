package org.example.DSA.sorting;

public class insertion {

    public void insertion (int [] a)
    {
        for (int i=1; i<a.length; i++)
        {
            int temp = a[i];
            int j = i-1;
            while (j>=0 && a[j]>temp)
            {
                a[j+1] = a[j];
                j = j-1;
            }
            a[j+1] = temp;
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
        int [] a = {2,111,200,5,65};
        insertion insertion = new insertion();
        insertion.insertion(a);
        insertion.print(a);
    }
}
