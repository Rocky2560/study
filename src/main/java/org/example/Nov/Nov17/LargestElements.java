package org.example.Nov.Nov17;

public class LargestElements {

    public static void main(String[] args) {
        int [] a = {10,20,4};
        int max =Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            max = Math.max(max,a[i]);
        }
        System.out.println(max);
    }
}
