package org.example.designpattern.singeletonpattern;

public class main {
    public static void main(String[] args) {
        singeleton singeleton = org.example.designpattern.singeletonpattern.singeleton.getInstance();
        singeleton singeleton1 = org.example.designpattern.singeletonpattern.singeleton.getInstance();
        System.out.println( (singeleton1 == singeleton));
    }
}
