package org.example.DI.construction.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(appconfig.class);
        Astudent astudent = applicationContext.getBean(Astudent.class);
        astudent.mCheating();
    }
}
