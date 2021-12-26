package com.relationship.aggregation;

public class Computer {
    private Mouse mouse;
    private Keyboard keyboard;

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }
}
