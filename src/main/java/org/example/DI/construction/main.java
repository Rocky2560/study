package org.example.DI.construction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        student1 student = applicationContext.getBean("student1", student1.class);
        student.mathCheating();
    }
}
