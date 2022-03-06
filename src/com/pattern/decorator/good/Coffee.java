package com.pattern.decorator.good;

public class Coffee extends Drink {

    @Override
    public float cost() {
        return super.getPrice();
    }

}