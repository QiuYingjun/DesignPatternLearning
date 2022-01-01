package com.pattern.factory.simplefactory.order;

import com.pattern.factory.simplefactory.pizza.CheesePizza;
import com.pattern.factory.simplefactory.pizza.GreekPizza;
import com.pattern.factory.simplefactory.pizza.Pizza;

public class SimpleFactory {
    public Pizza createPizza(String orderType) {

        Pizza pizza = null;
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName("greek pizza");
        } else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName("cheese pizza");
        }
        return pizza;
    }
}