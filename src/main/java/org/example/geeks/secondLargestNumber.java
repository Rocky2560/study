package org.example.geeks;

import java.util.Arrays;

public class secondLargestNumber {

        //One paas approach
        public void onepassApproach(int [] a)
        {
           int max = -1, secondmax = -1;
           for(int i =0; i<a.length; i++)
           {
               if (a[i]> max)
               {
                   secondmax = max;
                   max = a[i];
               }
               else if (a[i] < max && a[i]>secondmax)
               {
                   secondmax = a[i];
               }
           }
            System.out.println(secondmax);
        }
        //Naive Approach
        public void maxNumber (int [] a)
        {
            Arrays.sort(a);
            int n = a.length;
            for (int i = n-2; i>=0; i--)
            {
                if (a[i] != a[n-1])
                {
                    System.out.println(a[i]);
                    break;
                }
            }
        }

        //Two pass search approach
        public int twoPass (int [] a)
        {
            int max = a[0];
            for (int i=0; i<a.length; i++)
            {
                if (a[i] > max)
                {
                    max  = a[i];
                }
            }
        int secondMax = Integer.MIN_VALUE;
        for (int x: a)
        {
            if (max != x)
            {
                if (secondMax < x)
                {
                    secondMax = x;
                }
            }

        }
        return secondMax;
        }


        public static void main(String[] args) {
            int [] a = {2,1,4,6};
            secondLargestNumber secondLargestNumber = new secondLargestNumber();
            secondLargestNumber.maxNumber(a);
            secondLargestNumber.onepassApproach(a);
            System.out.println(secondLargestNumber.twoPass(a));
        }
}
