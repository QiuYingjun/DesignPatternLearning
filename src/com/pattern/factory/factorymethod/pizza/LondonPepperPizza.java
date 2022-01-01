package com.pattern.factory.factorymethod.pizza;

public class LondonPepperPizza extends Pizza {

    @Override
    public void prepare() {
        setName("London pepper pizza");
        System.out.println("preparing London pepper pizza");
    }

}
