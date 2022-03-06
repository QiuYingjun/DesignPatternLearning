package com.pattern.decorator.good;

abstract class Drink {
    private String desc;
    private float price = 0.0f;

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public float getPrice() {
        return this.price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public abstract float cost();
}