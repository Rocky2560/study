package org.example.interview;

public class countWords {

    public static void main(String[] args) {
        String sentence = "This is a sample sentence to count words";
        countWords(sentence);
        System.out.println();

    }
    public static int countWords(String op)
    {
        String[] op1 = op.trim().toLowerCase().split("//s+");
        return op1.length;
    }
}
