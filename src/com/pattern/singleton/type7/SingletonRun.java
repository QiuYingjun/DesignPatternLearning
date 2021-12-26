package com.pattern.singleton.type7;

public class SingletonRun {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2);
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
    }

}

class Singleton {

    private Singleton() {

    }

    private static class SingletonInstance {
        private static final Singleton instance = new Singleton();
    }

    public static Singleton getInstance() {

        return SingletonInstance.instance;
    }
}