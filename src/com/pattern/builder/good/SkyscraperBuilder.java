package com.pattern.builder.good;

public class SkyscraperBuilder extends HouseBuilder{

    @Override
    public void buildBase() {
        System.out.println("build skyscraper base");
    }

    @Override
    public void buildWall() {
        System.out.println("build skyscraper wall");
    }

    @Override
    public void buildRoof() {
        System.out.println("build skyscraper roof");
    }
    
}
