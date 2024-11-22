package org.example;

import java.util.ArrayList;
import java.util.List;

public class even {
    public static void main(String[] args) {
        List<Integer> input = new ArrayList<Integer>();
        input.add(1);
        input.add(2);
        input.add(3);

        if (input.parallelStream().anyMatch(x -> x % 2 !=0))
        {
            System.out.println("It is odd number");
        }
        else
        {
            System.out.println("It is even number"); }
//        for(int i:input)
//        {
//            if (i % 2 ==0)
//            {
//                System.out.println("It is even number");
//            }
//            else {
//                System.out.println("It is odd number");
//            }
//        }
    }
}
