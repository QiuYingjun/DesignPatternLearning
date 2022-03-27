package com.pattern.composite;

public abstract class Component {
    private String name;

    public Component(String name) {
        this.name = name;
    }

    abstract void print();

    abstract int getCount();

    protected void add(Component c) {
        throw new UnsupportedOperationException();
    }

    protected void remove(Component c) {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
