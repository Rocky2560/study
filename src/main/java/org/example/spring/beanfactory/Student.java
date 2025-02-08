package org.example.spring.beanfactory;

public class Student {

    private String name;

    private int age;

    public Student()
    {}

    public Student(String name, int age)
    {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString()
    {
    return "Name is "+name+ "Age is "+age;
    }
}
