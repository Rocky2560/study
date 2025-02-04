package org.example.spring.IOC;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

        sim sim = applicationContext.getBean("sim", org.example.spring.IOC.sim.class);

        sim.calling();
        sim.ringing();
    }
}
