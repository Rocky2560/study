package org.example.DI.setter.annotation;

import org.example.DI.setter.annotation.status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class employee {


    private String name;
    private status status;

    public employee(){ }

    public String getName() {
        return name;
    }

    @Autowired
    public void setName(@Value("sudip") String name) {
        this.name = name;
    }

    public status getStatus() {
        return status;
    }

    @Autowired
    public void setStatus(status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        status.print();
        System.out.println(name);
        return "name: "+ name;
    }
}
