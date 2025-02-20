package org.example.designpattern.factorypaatern;

public class client {

    public static void main(String[] args) {
        vehicleFactory vehicleFactory = new carFactory();
        vehicle vehicle = vehicleFactory.createVehicle();
        vehicle.drive();


//        bike.drive()
//
        vehicleFactory vehicleFactory1 = new bikeFactory();
        vehicle vehicle1 = vehicleFactory1.createVehicle();
        vehicle1.drive();


    }
}
