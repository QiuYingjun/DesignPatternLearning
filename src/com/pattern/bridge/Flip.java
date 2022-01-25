package com.pattern.bridge;

public class Flip extends FormFactor{

    public Flip(Brand brand) {
        super(brand);
    }
    public void open() {
        System.out.println("Flip");
        super.open();
    }
    public void close() {
        System.out.println("Flip");
        super.close();
    }
    public void call() {
        System.out.println("Flip");
        super.call();
    }
    
}
