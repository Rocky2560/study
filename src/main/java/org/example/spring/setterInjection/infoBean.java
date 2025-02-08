package org.example.spring.setterInjection;

import java.util.Map;

public class infoBean {
    private String name;
    private String title;
    private Map<String, String> map;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void display()
    {
        System.out.println("Hi "+name+", "+title);
        System.out.println("Framework Names: Description");
        for (Map.Entry<String, String> entry : map.entrySet())
            System.out.println(entry.getKey()+ ":" + entry.getValue());
    }
}
