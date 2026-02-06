package org.example.Feb.Feb6;

import java.util.ArrayList;

//[Naive Approach] Using Bit Manipulation - O(n log(n)) Time and O(1) Space
//The idea is to traverse for all numbers from 1 to n and generate their binary representations.
public class BinaryRepresentation {

    static ArrayList<String> generateBinary(int n) {
    ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            int temp = i;
            String binary = "";
            // Convert decimal number to binary
            while (temp > 0) {
                int rem = temp % 2;

                if (rem == 0)
                    binary += "0";
                else
                    binary += "1";

                temp = temp / 2;
            }
            // reverse to get correct order
            StringBuilder sb = new StringBuilder(binary);
            binary = sb.reverse().toString();

            result.add(binary);
        }

        return result;

            
        }
    }

    public static void main(String[] args) {
        int n=6;
        ArrayList<String> binaries = generateBinary(n);
        for (String bin : binaries)
            System.out.print(bin + " ");
        System.out.println();
    }
}
