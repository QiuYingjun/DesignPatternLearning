package com.pattern.factory.factorymethod.order;

import com.pattern.factory.factorymethod.pizza.BeijingCheesePizza;
import com.pattern.factory.factorymethod.pizza.BeijingPepperPizza;
import com.pattern.factory.factorymethod.pizza.Pizza;

public class BeijingOrderPizza extends OrderPizza {

    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new BeijingCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new BeijingPepperPizza();
        }
        return pizza;
    }

}
