package com.pattern.builder.ng;

public class CommonHouse extends AbstractHouse {

    @Override
    public void buildBase() {
        System.out.println("build common house base");
    }

    @Override
    public void buildWalls() {
        System.out.println("build common house walls");
    }

    @Override
    public void buildRoof() {
        System.out.println("build common house roof");
    }

}
