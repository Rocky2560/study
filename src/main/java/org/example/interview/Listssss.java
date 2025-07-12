package org.example.interview;
import java.util.LinkedList;
import java.util.List;
public class Listssss {

    public static String longestString(List<String> op)
    {
        if (op == null || op.isEmpty()) {
            return null; // or throw exception depending on use case
        }
        int longest = op.get(0).length();
        String t = "";
        for (String s: op)
        {
            if (s.length() > longest)
            {
                longest = s.length();
                t =s;

            }

        }
        return t;

    }

    public static void main(String[] args) {
        List <String> list = new LinkedList<String>();
        list.add("cat");
        list.add("elephant");
        list.add("tiger");
        list.add("hippopotamus");
        list.add("hippopotamuhjhkjkjkhs");
        System.out.println(longestString(list));



    }
}
