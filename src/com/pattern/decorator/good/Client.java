package com.pattern.decorator.good;

public class Client {
    public static void main(String[] args) {
        Drink order = new LongBlack();
        System.out.println(order.getDesc());
        System.out.println(order.cost());

        order = new Milk(order);
        System.out.println(order.getDesc());
        System.out.println(order.cost());

        order = new Chocolate(new Chocolate(order));
        System.out.println(order.getDesc());
        System.out.println(order.cost());
    }

}
