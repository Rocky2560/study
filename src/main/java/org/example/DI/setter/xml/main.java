package org.example.DI.setter.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        employee employee = applicationContext.getBean("employee", employee.class);
        employee.toString();
    }
}
