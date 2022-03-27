package com.pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class College extends Component {
    List<Component> components = new ArrayList<Component>();

    public College(String name) {
        super(name);
    }

    @Override
    int getCount() {
        int count = 0;
        for (Component c : components) {
            count += c.getCount();
        }
        return count;
    }

    @Override
    public void print() {
        System.out.println("\t" + getName() + ": " + getCount() + "人");
        for (Component c : components) {
            c.print();
        }
    }

    @Override
    protected void add(Component c) {
        components.add(c);
    }

    @Override
    protected void remove(Component c) {
        components.remove(c);
    }
}
