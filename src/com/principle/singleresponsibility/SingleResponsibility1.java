package com.principle.singleresponsibility;

public class SingleResponsibility1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("car");
        vehicle.run("plain");
        vehicle.run("ship");
    }
}

class Vehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + " is running on the road");
    }
}