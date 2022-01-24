package com.pattern.builder.ng;

public abstract class AbstractHouse {
    public abstract void buildBase();
    public abstract void buildWalls();
    public abstract void buildRoof();
    public void build() {
        buildBase();
        buildWalls();
        buildRoof();
    }
}
