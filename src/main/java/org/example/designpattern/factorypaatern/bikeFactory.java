package org.example.designpattern.factorypaatern;

public class  bikeFactory extends vehicleFactory{

    @Override
    public vehicle createVehicle() {
        return new bike();
    }
}
