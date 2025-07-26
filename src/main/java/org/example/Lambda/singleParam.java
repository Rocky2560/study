package org.example.Lambda;

import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface ZeroParameter
{
        void display();
//        int add (int a, int b);
}


public class singleParam {

    public static void main(String[] args) {
        ZeroParameter zeroParameter = () -> System.out.println("this is single paramter example");

        List<Integer> list = Arrays.asList(1,2,3,4,5);
        List<Integer> list1 = Arrays.asList(1,7,8,9);
        list.forEach(n -> System.out.print(n + " "));
        zeroParameter.display();


        String x ="5";
        System.out.println(x);

    }
}
