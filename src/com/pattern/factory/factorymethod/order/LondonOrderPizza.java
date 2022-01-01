package com.pattern.factory.factorymethod.order;

import com.pattern.factory.factorymethod.pizza.LondonCheesePizza;
import com.pattern.factory.factorymethod.pizza.LondonPepperPizza;
import com.pattern.factory.factorymethod.pizza.Pizza;

public class LondonOrderPizza extends OrderPizza {

    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new LondonCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new LondonPepperPizza();
        }
        return pizza;
    }

}
