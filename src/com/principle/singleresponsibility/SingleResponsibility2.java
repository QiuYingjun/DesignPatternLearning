package com.principle.singleresponsibility;

public class SingleResponsibility2 {
    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("car");
        WaterVehicle waterVehicle = new WaterVehicle();
        waterVehicle.run("ship");
        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("plain");
    }
}

class RoadVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + " is running on the road");
    }
}

class WaterVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + " is swimming on the water");
    }
}

class AirVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + " is flying in the sky");
    }
}