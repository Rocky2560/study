package org.example.DI.construction.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "org.example.DI")
public class appconfig {
//    @Bean
//    public int setAge()
//    {
//        return 10;
//    }
}
