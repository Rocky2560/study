package org.example.coding;

import java.util.ArrayList;

public class multiplication {

    public static void main(String[] args) {

        ArrayList<Integer> result = new ArrayList<>();
        int n = 3;
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += n;
            result.add(sum);
        }
        System.out.println(result);
    }
}
