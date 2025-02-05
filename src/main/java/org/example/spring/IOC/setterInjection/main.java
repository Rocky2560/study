package org.example.spring.IOC.setterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        infoBean infoBean = (infoBean) applicationContext.getBean("info");
        infoBean.display();
    }
}
