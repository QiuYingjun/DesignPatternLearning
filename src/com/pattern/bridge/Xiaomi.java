package com.pattern.bridge;

public class Xiaomi implements Brand{

    @Override
    public void open() {
        System.out.println("Xiaomi open");;
    }

    @Override
    public void call() {
        System.out.println("Xiaomi call");;
    }
        
    @Override
    public void close() {
        System.out.println("Xiaomi close");;
    }
    
}
