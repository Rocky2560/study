package org.example.interview;

public class missing_number {

    public static void main(String[] args) {
        int [] a ={1,2,4,5,6};
        int n =a.length;
        int expectedSum=0, originalSum =0;
        for (int i=0; i<a.length; i++)
        {
            originalSum += a[i];
        }
        expectedSum = n*(n+1)/2;
        System.out.println(originalSum-expectedSum);

    }
}
