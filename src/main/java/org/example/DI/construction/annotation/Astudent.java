package org.example.DI.construction.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Astudent {

    private int age;
    private aMath aMath;

    @Autowired
    public Astudent(@Value("${age:0}")int age, aMath aMath)
    {
        this.age = age;
        this.aMath = aMath;
    }

    public void mCheating()
    {
        System.out.println("my age is "+ age);
        aMath.cheating();
    }
}
