package org.example;

public class palindrome {

    public static void main(String[] args) {


//        String s = new String("cc");
        String input = "popu";
        StringBuffer str = new StringBuffer(input);
//        String reverse = re;
        String output = str.reverse().toString();
        System.out.println(output);
        System.out.println(input);
        if (!output.equals(input))
        {
            System.out.println( "false");
        }
        else
        {
            System.out.println("true");
        }
    }
}
