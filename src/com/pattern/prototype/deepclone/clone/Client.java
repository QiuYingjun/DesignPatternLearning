package com.pattern.prototype.deepclone.clone;

public class Client {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        Sheep sheep1 = new Sheep("Tom", 1, "white");
        Sheep sheep2 = new Sheep("Jerry", 2, "black");
        Sheep sheep3 = new Sheep("Spike", 3, "gray");
        sheep1.setFriend(sheep2);
        sheep2.setFriend(sheep3);

        Sheep sheep4 = sheep1.clone();
        System.out.println(sheep1);
        System.out.println(sheep4);
        long endTime = System.currentTimeMillis();
        System.out.println("程序运行时间：" + (endTime - startTime) + "ms");
    }
}
