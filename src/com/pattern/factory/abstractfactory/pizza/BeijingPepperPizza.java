package com.pattern.factory.abstractfactory.pizza;

public class BeijingPepperPizza extends Pizza {

    @Override
    public void prepare() {
        setName("Beijing pepper pizza");
        System.out.println("preparing Beijing pepper pizza");
    }

}
