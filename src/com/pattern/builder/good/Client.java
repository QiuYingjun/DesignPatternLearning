package com.pattern.builder.good;

public class Client {
    public static void main(String[] args) {
        HouseBuilder commonBuilder = new CommonBuilder();
        HouseDirector houseDirector = new HouseDirector(commonBuilder);
        House house1 = houseDirector.construct();

        HouseBuilder skyscraperBuilder = new SkyscraperBuilder();
        houseDirector.setHouseBuilder(skyscraperBuilder);
        House house2 = houseDirector.construct();
    }
    
}
