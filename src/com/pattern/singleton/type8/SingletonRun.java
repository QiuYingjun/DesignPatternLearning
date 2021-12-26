package com.pattern.singleton.type8;

public class SingletonRun {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.INSTANCE;
        Singleton singleton2 = Singleton.INSTANCE;
        System.out.println(singleton1 == singleton2);
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
        singleton1.sayOK();
        singleton2.sayOK();
    }

}

enum Singleton {
    INSTANCE;

    public void sayOK() {
        System.out.println("ok");
    }
}