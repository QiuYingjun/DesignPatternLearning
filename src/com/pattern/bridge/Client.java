package com.pattern.bridge;

public class Client {
    public static void main(String[] args) {
        FormFactor phone = new Flip(new Vivo());
        phone.open();
        phone.call();
        phone.close();
    }

}
