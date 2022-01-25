package com.pattern.adapter.defaultadapter;

public class Phone {
    Listener listener ;
    public void setAdapter(Listener listener) {
        this.listener = listener;
    }
    public void run() {
        if(listener!=null) {
            listener.m1();
            listener.m2();
            listener.m3();
            listener.m4();
        }
    }
}
