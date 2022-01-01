package com.pattern.factory.ng.pizza;

public class CheesePizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("preparing cheese pizza");
    }

}
