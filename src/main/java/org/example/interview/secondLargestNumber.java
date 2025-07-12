package org.example.interview;

public class secondLargestNumber {

    public static int largest(int[] a)
    {
        int max = Integer.MIN_VALUE;
        int min = Integer.MIN_VALUE;
        int three= Integer.MIN_VALUE;

        for (int i=0; i<a.length; i++)
        {
            if (a[i]> max)
            {
                three = min;
                min = max;
                max = a[i];
            }
            else if (a[i] > min && a[i] != max)
            {
                three = min;
                min = a[i];
            }
            else if (a[i] > three && a[i] != max && a[i] != min)
            {

                three = a[i];
            }
        }
        return three;
    }
    public static void main(String[] args) {
        int [] a = {1,2,2,3,45,65};
        int op = largest(a);
        System.out.println(op);
        System.out.println();
    }
}
