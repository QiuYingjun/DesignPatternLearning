package com.pattern.builder.good;

public class HouseDirector {
    HouseBuilder houseBuilder = null;
    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }
    public HouseBuilder getHouseBuilder() {
        return this.houseBuilder;
    }
    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }
    public House construct() {
        houseBuilder.buildBase();
        houseBuilder.buildWall();
        houseBuilder.buildRoof();
        return houseBuilder.buildHouse();
    }
}