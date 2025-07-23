package org.example.comparable;

public class Person implements Comparable<Person>{
    private String name;
    private int age;
    private double salary;

    public Person(String name, int age, double salary)
    {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public double getSalary()
    {
        return salary;
    }


    public int compareTo(Person person)
    {
        return this.name.compareTo(person.name);
    }


    public String toString()
    {
        return name+" "+ age + " "+ salary;
    }


}
