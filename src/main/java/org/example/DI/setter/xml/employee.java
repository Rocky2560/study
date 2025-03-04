package org.example.DI.setter.xml;

public class employee {


    private String name;
    private status status;

    public employee(){ }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public status getStatus() {
        return status;
    }

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
