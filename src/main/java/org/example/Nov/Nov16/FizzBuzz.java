package org.example.Nov.Nov16;

import java.util.ArrayList;

//
//Fizz Buzz
//Last Updated : 23 Jul, 2025
//Given an integer n, for every positive integer i <= n, the task is to print,
//
//        "FizzBuzz" if i is divisible by 3 and 5,
//        "Fizz" if i is divisible by 3,
//        "Buzz" if i is divisible by 5
//        "i" as a string, if none of the conditions are true.
public class FizzBuzz {

    public static void main(String[] args){
        int n = 20;
        ArrayList<String> res = fizzBuzz(n);
        ArrayList<String> res1 = fizzBuzzOptimal(n);
        for (String s : res) {
            System.out.print(s + " ");
        }
        for (String s : res1) {
            System.out.println(s + " ");
        }

    }

    private static ArrayList<String> fizzBuzzOptimal(int n) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String s ="";

            if (i % 3 == 0) s+=("Fizz");
            if (i % 5 == 0) s+=("Buzz");
            if (s.isEmpty()) s += i;
            arrayList.add(s);
        }
        return arrayList;
    }

    private static ArrayList<String> fizzBuzz(int n) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (i % 3 == 0 && i % 5 == 0)
            { arrayList.add("fizzbuzz");}
            else if (i % 3 == 0) arrayList.add("Fizz");
            else if (i % 5 == 0) arrayList.add("Buzz");

            else arrayList.add(Integer.toString(i));
        }
        return arrayList;
    }
}
