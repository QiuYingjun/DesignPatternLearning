package com.pattern.factory.abstractfactory.pizza;

public class LondonCheesePizza extends Pizza {

    @Override
    public void prepare() {
        setName("London cheese pizza");
        System.out.println("preparing London cheese pizza");
    }

}
