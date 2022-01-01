package com.pattern.factory.abstractfactory.order;

import com.pattern.factory.abstractfactory.pizza.Pizza;

public interface AbsFactory {
    public Pizza createPizza(String orderType);
}
