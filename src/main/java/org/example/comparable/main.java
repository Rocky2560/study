package org.example.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class main {

    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Alice",50,30));
        list.add(new Person("Bob",30,90));
        list.add(new Person("MArley",90,60));

        Collections.sort(list);
        System.out.println("Soreted items");
        for (Person p: list) {
            System.out.println(p);
        }

        Collections.sort(list, new AgeComparator());
        System.out.println("\nSorted by age (Comparator):");
        for (Person p : list) System.out.println(p);

        Collections.sort(list, new salaryComparator());
        System.out.println("\nSorted by age (Comparator):");
        for (Person p : list) System.out.println(p);


    }
}
