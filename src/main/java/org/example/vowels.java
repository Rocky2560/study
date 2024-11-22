package org.example;

public class vowels {
    public static void main(String[] args) {
        String str = "s";

        if (str.toLowerCase().matches(".*[aeiou]*."))
        {
            System.out.println("Its vowels");
        }
        else
        {
            System.out.println("Its not vowels");
        }
    }
}
