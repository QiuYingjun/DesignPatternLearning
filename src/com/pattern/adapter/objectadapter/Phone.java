package com.pattern.adapter.objectadapter;

public class Phone {
    public void charge(IVoltage5V iVoltage5V ) {
        if(iVoltage5V.output5V() == 5) {
            System.out.println("charging");
        }
        else {
            System.out.println("cannot charge");
        }
    }
    
}
