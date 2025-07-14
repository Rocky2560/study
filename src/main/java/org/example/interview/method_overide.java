package org.example.interview;

class child {


    public void display ()
    {
        System.out.println("The child class in invoked");
    }

}

public class method_overide extends child{

    public int area(int a)
    {
        return a*a;
    }
    public int area(int a, int b)
    {
        return a*b;
    }

    @Override
    public void display()
    {
        System.out.println("the parent class is invoked");
    }

    public static void main(String[] args) {
        int a=2, b=9;
        method_overide methodOveride = new method_overide();
        System.out.println(methodOveride.area(a));
        System.out.println(methodOveride.area(a, b));

        method_overide s1 = new method_overide();
        s1.display();

    }
}

