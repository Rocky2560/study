package org.example.spring.IOC.beanfactory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[] args) {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) beanFactory.getBean("student");
        System.out.println(student);
    }
}
