package org.example.interview;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class practice {

    public static void main(String[] args) {
        String s = "sudip";
        char [] chars = new char[s.length()];
        int i=0, j=s.length()-1;
        while(i <= j)
        {
            chars[i] = s.charAt(j);
            chars[j]= s.charAt(i);
            i++;
            j--;
        }
        System.out.println(chars);


        int n =15;
        if (n==1 || n == 0)
        {
            System.out.println("Not prime");
        }

        for (int p=2; p<=Math.sqrt(n); p++)
        {
            if (n % i == 0)
            {
                System.out.println("Not prime");
            }
            else
            {
                System.out.println("prime number is detected");
            }
        }

        int a=0,b=1;
        int c = a+b;
        int in =2  ;
        for (int x = 0; x<=in; x++)
        {
            System.out.println(a + " ");
            a=b;
            b=c;
            c= a+b;
        }


        List<Integer> integerList = new ArrayList<>();
        integerList.add(3);
        integerList.add(5);
        integerList.add(8);
        System.out.println(integerList.stream().anyMatch(ist-> ist % 2 != 0));

        String si = "  abc  def\t";

        si = si.strip().trim();

        System.out.println(si);

        String op = " s d";

        StringBuilder str = new StringBuilder();
        char[] ct = op.toCharArray();
        for (char cr : ct)
        {
            if (!Character.isWhitespace(cr))
            {
                str.append(cr);
            }
        }
        System.out.println(str.toString());

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(5);
        linkedList.add(6);

        LinkedList<Integer> ll1 = new LinkedList<>();
        linkedList.descendingIterator().forEachRemaining(ll1::add);
        for (int y: ll1)
        {
            System.out.println(y);
        }
    }


}
