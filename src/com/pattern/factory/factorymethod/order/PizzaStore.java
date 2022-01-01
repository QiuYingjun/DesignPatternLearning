package com.pattern.factory.factorymethod.order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PizzaStore {
    public static void main(String[] args) {
        String loc = getLocal();
        if (loc.equals("Beijing")) {
            new BeijingOrderPizza();
        } else if (loc.equals("London")) {
            new LondonOrderPizza();
        }
    }

    private static String getLocal() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza location: ");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
