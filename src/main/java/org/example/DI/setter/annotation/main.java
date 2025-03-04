package org.example.DI.setter.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(appConfig.class);
        employee employee = applicationContext.getBean(org.example.DI.setter.annotation.employee.class);
        employee.toString();
    }
}
