package org.example.designpattern.singeletonpattern;

public class singeleton {

    private static  singeleton singeleton;

    private singeleton()
    {
        System.out.println("singeleton is created");
    }

    public static singeleton getInstance()
    {
        if (singeleton == null)
        {
            singeleton = new singeleton();
        }
        return singeleton;
    }
}
