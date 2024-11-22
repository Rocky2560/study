package org.example.Array;

public class reverse {

    //Using Temporary variable using temporary variable
    static void reverseTempArray(int[] a)
    {
        int [] output = new int[a.length];
        for (int i=0; i<a.length; i++)
        {
            output[i] = a[a.length-1-i];
        }

        for (int i=0; i<a.length; i++)
        {
            a[i] = output[i];
        }

    }

    //Using two pointers
    static void reversePointer(int[] arr)
    {
       int left =0, right = arr.length-1;
       while (left < right)
       {
           int temp = arr[left];
           arr[left] = arr[right];
           arr[right] = temp;
           //Increment left by 1
           left++;
           //Decrement right by 1
           right--;
       }
    }

    //Using Recursion
    static void reverseRecursion(int[] a, int l, int r)
    {
        if (l>=r)
            return ;

        int temp = a[l];
        a[l] = a[r];
        a[r] = temp;
        reverseRecursion(a,l+1,r-1);
        }

    //Printing the Arrray
    static void print(int[] a)
    {
        for (int i=0; i<a.length; i++)
        {
            System.out.print(a[i] + " ");
        }
    }


    public static void main(String[] args) {

        int [] a = {2,8,5,3,99};
        int [] b = {2,8,5,3,99};
        int [] c = {2,8,5,3,99};

        reverseTempArray(a);
        print(a);

        System.out.println();
        reversePointer(b);
        print(b);

        System.out.println();
        reverseRecursion(c,0,c.length-1);
        print(c);
    }
}
