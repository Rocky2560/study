package org.example.DI.construction;

public class student1 {

    private int name;
    private math math;
    // Constructor for Dependency Injection
    public student1(int name, math math) {
        this.name = name;
        this.math = math;
    }
   public void mathCheating()
   {
       System.out.println("My id is "+ name);
       math.cheating();
   }
}
