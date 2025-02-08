package org.example.spring.Boot;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class demoApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.scan("org.example.spring.Boot");
        applicationContext.refresh();

        componentDemo componentDemo = applicationContext.getBean(org.example.spring.Boot.componentDemo.class);
        componentDemo.demoFunction();

        applicationContext.close();
    }
}
