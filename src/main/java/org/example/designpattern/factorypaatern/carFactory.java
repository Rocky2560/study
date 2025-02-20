package org.example.designpattern.factorypaatern;

public class carFactory extends vehicleFactory{

    @Override
    public vehicle createVehicle() {
        return new car();
    }
}
