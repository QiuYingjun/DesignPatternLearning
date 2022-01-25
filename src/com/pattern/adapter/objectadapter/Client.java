package com.pattern.adapter.objectadapter;

public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone();
        VoltageAdapter voltageAdapter = new VoltageAdapter(new Voltage220V());
        phone.charge(voltageAdapter);
    }
}
