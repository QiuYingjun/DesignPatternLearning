package com.principle.singleresponsibility;

public class SingleResponsibility3 {
    public static void main(String[] args) {
        Vehicle2 vehicle = new Vehicle2();
        vehicle.run("car");
        vehicle.run("motorbike");
        vehicle.runAir("plain");
        vehicle.runWater("ship");
    }
}

/**
 * 1. 降低类的复杂度，一个类只负责一项职责
 * 2. 提高类的可读性，可维护性
 * 3. 降低变更引起的风险
 * 4. 只有当每个类中方法数量足够少、足够简单，才可以将类融合并在方法级保持单一职责
 */
class Vehicle2 {
    public void run(String vehicle) {
        System.out.println(vehicle + " is running on the road");
    }

    public void runAir(String vehicle) {
        System.out.println(vehicle + " is flying in the sky");
    }

    public void runWater(String vehicle) {
        System.out.println(vehicle + " is swimming in the water");
    }
}