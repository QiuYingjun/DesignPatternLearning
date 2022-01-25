package com.pattern.adapter.objectadapter;

public class VoltageAdapter implements IVoltage5V {
    private Voltage220V voltage220v;

    public VoltageAdapter(Voltage220V voltage220v) {
        this.voltage220v = voltage220v;
    }

    @Override
    public int output5V() {
        int dst = 0;
        if (this.voltage220v != null) {
            int src = this.voltage220v.output220V();
            dst = src / 44;
            System.out.println("convert " + src + "V to " + dst + "V");
        }
        System.out.println("output " + dst + "V");
        return dst;
    }
}
