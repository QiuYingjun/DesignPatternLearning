package com.pattern.bridge;

public class Slate extends FormFactor{

    public Slate(Brand brand) {
        super(brand);
    }
    public void open() {
        System.out.println("Slate");
        super.open();
    }
    public void close() {
        System.out.println("Slate");
        super.close();
    }
    public void call() {
        System.out.println("Slate");
        super.call();
    }
    
}
