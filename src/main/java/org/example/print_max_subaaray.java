package org.example;

public class print_max_subaaray {
    public static void main(String[] args) {
        int arr[] = {2, 3, -8, 7, -1, 2, 3};
        int length = arr.length;
        int max =arr[0];
        int start=0, end=0;
        for (int i=0; i<length; i++)
        {
            int currentSum=0;
            for (int j=i; j<length; j++)
            {
                currentSum += arr[j];
                if (currentSum> max)
                {
                    max = currentSum;
                    start = i;
                    end = j;
                }
            }
        }
//        System.out.println(end);
        for (int z= start; z<=end; z++)
        {
//            System.out.println(arr[z]);
        }

        //Kadenes Algorithm
        int restart =0, reEnd =0;
        int currStart= 0;
        int maxSum = arr[0], maxEnding = arr[0];
        for (int q=1; q<length; q++)
        {

            if (maxEnding+arr[q] < arr[q])
            {
                maxEnding = arr[q];
                currStart = q;
            }
            else
            {
                maxEnding +=arr[q];
            }
            if (maxEnding> maxSum)
            {
                maxSum = maxEnding;
                restart = currStart;
                reEnd = q;
            }
        }
        for (int i=restart; i<=reEnd; i++)
        {
            System.out.println(arr[i]);
        }

    }
}
