package org.example.Abstract;

abstract class Bike
{
    abstract void run ();
}
public class Vehicle extends Bike {
void run() {
    System.out.println("running safely");
}

    public static void main(String[] args) {
        Bike bike = new Vehicle();
        bike.run();
            }
        }


