package org.example.Nov.Nov14;

//Given a non-negative number represented as an array of digits. The task is to add 1 to the number (increment the number represented by the digits by 1). The digits are stored such that the most significant digit is the first element of the array.
//
//Examples :
//
//Input : [1, 2, 4]
//Output : 125
//Explanation: 124 + 1 = 125
//
//Input : [9, 9, 9]
//Output: 1000
//Explanation: 999 + 1 = 1000
public class Plus1 {


    public static void main(String[] args) {
        int[] arr = {1,2, 9};
        int[] res = addOne(arr);
        for(int i : res) {
            System.out.print(i);
        }
    }

    private static int[] addOne(int[] arr) {

        int n = arr.length;
        for (int i = n-1; i >= 0; i--) {
            if (arr[i] < 9)
            {
                arr[i]++;
                return arr;
            }
            arr[i] = 0;

        }
        int [] result = new int[n+1];
        result[0] = 1;

        return result;
    }
}
