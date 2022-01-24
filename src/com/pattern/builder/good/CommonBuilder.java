package com.pattern.builder.good;

public class CommonBuilder extends HouseBuilder {

    @Override
    public void buildBase() {
        System.out.println("build common base");
    }

    @Override
    public void buildWall() {
        System.out.println("build common wall");
    }

    @Override
    public void buildRoof() {
        System.out.println("build common roof");
    }
    
}
