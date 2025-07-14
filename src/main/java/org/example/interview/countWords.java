package org.example.interview;

public class countWords {

    public static void main(String[] args) {

        String sentence = "This is a sample sentence to count words";

        System.out.println(countWords(sentence));

    }
    public static int countWords(String op)
    {
        String[] op1 = op.trim().toLowerCase().split("\\s+");
//        System.out.println(op1);
        return op1.length;
    }
}
