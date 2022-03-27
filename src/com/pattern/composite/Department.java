package com.pattern.composite;

public class Department extends Component {
    int count = 0;

    public Department(String name) {
        super(name);
    }

    @Override
    int getCount() {
        return this.count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public void print() {
        System.out.println("\t\t" + getName() + ": " + getCount() + "人");
    }
}
