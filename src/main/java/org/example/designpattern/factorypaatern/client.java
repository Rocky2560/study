package org.example.designpattern.factorypaatern;

public  class client {
    public abstract class vehicle {


        public abstract void printVehicle();
    }
    class TwoWheeler extends vehicle
    {

        @Override
        public void printVehicle() {
            System.out.println("two wheeler");
        }
    }

    class FourWheeler extends vehicle
    {
        @Override
        public void printVehicle()
        {
            System.out.println("Four wheeler");
        }
    }

    interface VehicleFactory
    {
        vehicle createVehicle();
    }

    class TwoWheelFactory implements VehicleFactory
    {
        public vehicle createVehicle()
        {
            return new TwoWheeler();
        }
    }

    class FourWheelFactory implements VehicleFactory
    {
        public vehicle createVehicle()
        {
            return new FourWheeler();
        }
    }

//    class client
//    {
//        private vehicle pvehicle;
//
//        public client (VehicleFactory factory)
//        {
//            pvehicle = factory.createVehicle();
//        }
//
//        public vehicle getVehicle()
//        {
//            return pvehicle;
//        }
//    }
    }
