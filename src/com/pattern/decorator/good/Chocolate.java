package com.pattern.decorator.good;

public class Chocolate extends Decorator {

    public Chocolate(Drink obj) {
        super(obj);
        setDesc("Chocolate");
        setPrice(3.0f);
    }
}
