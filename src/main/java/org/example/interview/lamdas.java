package org.example.interview;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class lamdas {

    public static void main(String[] args) {
        List <Integer> list1 = Arrays.asList(1,2,3,4,5);

        list1.forEach(list -> System.out.println(list));
    }
}
