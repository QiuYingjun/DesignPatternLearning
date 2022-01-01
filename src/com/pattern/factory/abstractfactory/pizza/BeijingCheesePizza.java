package com.pattern.factory.abstractfactory.pizza;

public class BeijingCheesePizza extends Pizza {

    @Override
    public void prepare() {
        setName("Beijing cheese pizza");
        System.out.println("preparing Beijing cheese pizza");
    }

}
