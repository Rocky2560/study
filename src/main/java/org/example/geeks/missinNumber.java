package org.example.geeks;

public class missinNumber {

    //Sum formaulae
    public void formulaSum(int [] a)
    {
        int n = a.length+1;
        int actualSum = 0;
        for (int x:a)
        {
            actualSum += x;
        }
        int sum = (n*(n+1))/2;
        int op = sum - actualSum;
        System.out.println("Misssng Number is "+ op);
    }

    //Naive Appraoch
    public void missing(int [] a) {
        int n = a.length+1;
        int[] result = new int[n + 1];
        for (int i = 0; i < a.length; i++) {
            result[a[i]]++;
        }
        for (int i = 1; i <=n; i++) {
            if (result[i] == 0)
            {
                System.out.println(i+" is the missing number");
            }
        }
    }
    public static void main(String[] args) {
        int [] a = {1,2,3,5};
        missinNumber missinNumber = new missinNumber();
        missinNumber.missing(a);
        missinNumber.formulaSum(a);

    }
}
