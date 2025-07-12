package org.example.interview;

import java.util.Scanner;

public class vowels_String {
    public static void countVowelsAndConsonants(String str) {
        int vowels = 0, consonants = 0;

        // Convert to lowercase for easier comparison
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isLetter(ch)) { // Only consider alphabetic characters
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        countVowelsAndConsonants(input);

        scanner.close();
    }
}
