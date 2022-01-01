package com.pattern.factory.ng.pizza;

public class GreekPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("preparing greek pizza");
    }

}
