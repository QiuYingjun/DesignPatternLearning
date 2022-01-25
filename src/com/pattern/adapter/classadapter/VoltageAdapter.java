package com.pattern.adapter.classadapter;

public class VoltageAdapter extends Voltage220V implements IVoltage5V {
    @Override
    public int output5V() {
        int src = output220V();
        int dst = src / 44;
        System.out.println("output " + dst + "V");
        return dst;
    }
}
