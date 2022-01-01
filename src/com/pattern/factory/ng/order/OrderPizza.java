package com.pattern.factory.ng.order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.pattern.factory.ng.pizza.CheesePizza;
import com.pattern.factory.ng.pizza.GreekPizza;
import com.pattern.factory.ng.pizza.Pizza;

public class OrderPizza {
    public OrderPizza() {
        Pizza pizza = null;
        String orderType;
        do {
            orderType = getType();
            if (orderType.equals("greek")) {
                pizza = new GreekPizza();
                pizza.setName("greek pizza");
            } else if (orderType.equals("cheese")) {
                pizza = new CheesePizza();
                pizza.setName("cheese pizza");
            } else {
                break;
            }
            pizza.bake();
            pizza.cut();
            pizza.box();
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
