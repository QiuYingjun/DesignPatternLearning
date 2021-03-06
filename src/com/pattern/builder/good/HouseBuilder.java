package com.pattern.builder.good;

public abstract class HouseBuilder {
    protected House house = new House();
    public abstract void buildBase();
    public abstract void buildWall();
    public abstract void buildRoof();
    public House buildHouse(){
        return this.house;
    }
}
