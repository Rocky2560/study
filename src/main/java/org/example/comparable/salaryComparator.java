package org.example.comparable;

import java.util.Comparator;

public class salaryComparator implements Comparator<Person> {

    public int compare (Person p1, Person p2)
    {
        return Double.compare(p1.getSalary(), p2.getSalary());
    }


}
