package com.pattern.prototype.shallowclone;

public class Client {
    public static void main(String[] args) {
        Sheep sheep1 = new Sheep("Tom", 1, "white");
        sheep1.setFriend(new Sheep("Jerry", 1, "black"));
        Sheep sheep2 = sheep1.clone();

        System.out.println(sheep1);
        System.out.println(sheep2);
    }

}
