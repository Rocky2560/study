package org.example.interview;


public class polymorphism extends test {
    public static int area(int a, int b)
    {
        return a*b;
    }
    public static double area(double a, double b)
    {
        return a*b;
    }
    @Override
    public void display()
    {
        System.out.println("The child is me");
    }

    public static void main(String[] args) {

        System.out.println(area(2,4));
        System.out.println(area(2.0,5.0));
        test polymorphism =  new polymorphism();
        polymorphism.display();

    }
}
 class test{
    public void display()
    {
        System.out.println("The parent is me");
    }
}