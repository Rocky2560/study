package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class findString {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("/home/rocky/Sudip--Manandhar.pdf");

        Scanner sc = new Scanner(file);

        while (sc.hasNextLine())
        {
            String line = sc.nextLine();
            if (line.contains("sudip"))
            {
                sc.close();
                System.out.println("true");
            }
        }
        sc.close();
        System.out.println("false");

    }
}
