package com.pattern.factory.abstractfactory.order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.pattern.factory.abstractfactory.pizza.Pizza;

public class OrderPizza {
    AbsFactory factory;

    public OrderPizza(AbsFactory factory) {
        setFactory(factory);
    }

    private void setFactory(AbsFactory factory) {
        this.factory = factory;
        Pizza pizza = null;
        String orderType = "";
        do {
            orderType = getType();
            pizza = this.factory.createPizza(orderType);
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("order failed");
            }
        } while (true);
    }

    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type: ");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
