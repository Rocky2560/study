package org.example.interview;

import java.util.Arrays;
import java.util.Random;

public class shuffleArray {

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};

        Random random = new Random();
        for (int x=0; x< arr.length;x++)
        {
            int randomIndexToSwap = random.nextInt(arr.length);
            int temp = arr[randomIndexToSwap];
            arr[randomIndexToSwap] = arr[x];
            arr[x] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
