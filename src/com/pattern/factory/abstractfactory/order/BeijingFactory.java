package com.pattern.factory.abstractfactory.order;

import com.pattern.factory.abstractfactory.pizza.BeijingCheesePizza;
import com.pattern.factory.abstractfactory.pizza.BeijingPepperPizza;
import com.pattern.factory.abstractfactory.pizza.Pizza;

public class BeijingFactory implements AbsFactory {

    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new BeijingCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new BeijingPepperPizza();
        }
        return pizza;
    }
}
