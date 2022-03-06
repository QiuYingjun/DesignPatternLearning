package com.pattern.decorator.good;

public class Milk extends Decorator {

    public Milk(Drink obj) {
        super(obj);
        setDesc("Milk");
        setPrice(2.0f);
    }
}
