package org.example.interview;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;

public class dateFormat {
    public static void main(String[] args) {
        String pattern = "MM-dd-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(new Date());
        System.out.println(date);

        LinkedList<Integer>linkedList= new LinkedList<>();
        linkedList.add(1);
        linkedList.add(123);
        LinkedList<Integer>linkedList2= new LinkedList<>();
        linkedList2.add(2);
        LinkedList<Integer>linkedList3= new LinkedList<>();
        linkedList.addAll(linkedList2);
        System.out.println(linkedList);


        String s = "hello";
        String p = new String("hello");
        System.out.println(s==p);

        String textBlock = """
  Hi
  Hello
  Yes""";
        System.out.println(textBlock);
    }
}
