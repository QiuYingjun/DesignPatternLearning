package com.pattern.decorator.good;

public class Soy extends Decorator {

    public Soy(Drink obj) {
        super(obj);
        setDesc("Soy");
        setPrice(1.5f);
    }
}
