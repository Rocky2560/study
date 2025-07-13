package org.example.designpattern.builder;

public class main {
    public static void main(String[] args) {
        User user = new User.userBuilder("").age(25).address("dallu").build();
        System.out.println(user.toString());
    }
}
