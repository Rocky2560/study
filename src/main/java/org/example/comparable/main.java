package org.example.comparable;

import java.util.*;
import java.util.stream.Collectors;

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


        List<Person> people = Arrays.asList(new Person("Alice", 20, 60),
                new Person("Bob", 10, 10),
        new Person("Ali", 30, 50));

        List<Person> op = people.stream().sorted(Comparator.comparing(Person::getName)).collect(Collectors.toList());

        System.out.println("Soreted by age using streams");
        op.forEach(System.out::println);
    }
}
