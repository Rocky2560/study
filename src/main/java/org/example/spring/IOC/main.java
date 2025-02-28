package org.example.spring.IOC;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

        sim sim = applicationContext.getBean("sims", org.example.spring.IOC.sim.class);
        sim.calling();
        sim.ringing();
    }
}
