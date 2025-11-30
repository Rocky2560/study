package org.example.Nov.Nov30;

import java.math.BigInteger;

//Given two numbers as strings. The numbers may be very large (may not fit in long long int), the task is to find sum of these two numbers.
//
//Examples:
//
//Input: s1 = "23", s2 = "25"
//Output: "48"
//
//Input: s1 = "00", s2 = "000"
//Output: "0"
//
//Input: s1 = "10000000", s2 = "89990000"
//Output: 99990000

public class LArgestSum {

    public static void main(String []args){
        String s1 = "25";
        String s2 = "23";

        BigInteger a = new BigInteger(s1);
        BigInteger b = new BigInteger(s2);

        System.out.println(a.add(b));

    }
}
