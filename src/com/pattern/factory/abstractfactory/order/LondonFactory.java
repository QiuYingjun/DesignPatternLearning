package com.pattern.factory.abstractfactory.order;

import com.pattern.factory.abstractfactory.pizza.LondonCheesePizza;
import com.pattern.factory.abstractfactory.pizza.LondonPepperPizza;
import com.pattern.factory.abstractfactory.pizza.Pizza;

public class LondonFactory implements AbsFactory {

    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new LondonCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new LondonPepperPizza();
        }
        return pizza;
    }
}
