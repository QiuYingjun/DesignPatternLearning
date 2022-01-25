package com.pattern.adapter.defaultadapter;

public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.setAdapter(new AbstractListenerAdapter() {
            @Override
            public void m2() {
                System.out.println("override m2");
            }
            @Override
            public void m4() {
                System.out.println("override m4");
            }
        });
        phone.run();
    }
}
