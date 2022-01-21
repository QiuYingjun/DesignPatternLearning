package com.pattern.prototype.cloneable;

public class Client {
    public static void main(String[] args) {
        Sheep sheep1 = new Sheep("Tom", 1, "white");
        Sheep sheep2 = sheep1.clone();
        Sheep sheep3 = sheep1.clone();
        Sheep sheep4 = sheep1.clone();
        Sheep sheep5 = sheep1.clone();
        System.out.println(sheep1);
        System.out.println(sheep2);
        System.out.println(sheep3);
        System.out.println(sheep4);
        System.out.println(sheep5);
    }

}
