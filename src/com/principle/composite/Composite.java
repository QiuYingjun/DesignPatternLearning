package com.principle.composite;

public class Composite {
    public static void main(String[] args) {
        B b = new B();
        b.func();

        B1 b1 = new B1();
        b1.func();

        B2 b2 = new B2();
        b2.func(new A());

        B3 b3 = new B3();
        b3.setA(new A());
        b3.func();

        B4 b4 = new B4(new A());
        b4.func();
    }
}

class A {
    public void func() {
        System.out.println("A print");
    }
}

// 直接继承耦合性太强
class B extends A {
}

// 通过成员变量
class B1 {
    private A a = new A();

    public void func() {
        System.out.println("B1");
        this.a.func();
    }
}

// 通过参数传进来
class B2 {
    public void func(A a) {
        System.out.println("B2");
        a.func();
    }
}

// 通过setter
class B3 {
    private A a;

    public void setA(A a) {
        this.a = a;
    }

    public void func() {
        System.out.println("B3");
        this.a.func();
    }
}

// 通过构造器传进来
class B4 {
    private A a;

    B4(A a) {
        this.a = a;
    }

    public void func() {
        System.out.println("B4");
        this.a.func();
    }
}