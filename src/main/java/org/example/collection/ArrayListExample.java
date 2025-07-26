package org.example.collection;

import org.example.spring.beanfactory.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(12);
        arrayList.add(5);
        arrayList.add(8);
        arrayList.add(10);

        //Print using iterator
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext())
        {
            System.out.print(iterator.next() + " ");
        }
        ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
        arrayList1.add(2);
        arrayList1.add(15);
        arrayList1.add(82);
        arrayList1.add(109);

        arrayList1.removeIf(x -> x.equals(2));
        arrayList1.addAll(arrayList);
        for (int y:arrayList1)
        {
            System.out.println(y + " ");
        }


        System.out.println(arrayList.get(3));
        arrayList.set(2,100);




        Collections.sort(arrayList);
        //for-each loop
        for (int x: arrayList)
        {
            System.out.print(x +" ");
        }

        student student = new student(1,"sudip");
        student student1 = new student(2,"alisha");
        student student2 = new student(3,"purab");

        ArrayList<student> list = new ArrayList<student>();
        list.add(student);
        list.add(student1);
        list.add(student2);
        for (student s: list)
        {
            System.out.println(s.id +" "+ s.name);
        }




    }

    static class student
    {
        int id;
        String name;

     public student(int id, String name)
     {
         this.id = id;
         this.name = name;
     }
    }
}
