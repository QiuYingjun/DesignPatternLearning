package com.principle.segregation;

public class Segregation1 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.depend1(b);
        a.depend2(b);
        a.depend3(b);

        C c = new C();
        D d = new D();
        c.depend1(d);
        c.depend4(d);
        c.depend5(d);

    }

}

class B implements Interface1 {
    public void operation1() {
        System.out.println("B operation1");
    }

    public void operation2() {
        System.out.println("B operation2");
    }

    public void operation3() {
        System.out.println("B operation3");
    }

    public void operation4() {
        System.out.println("B operation4");
    }

    public void operation5() {
        System.out.println("B operation5");
    }

}

class D implements Interface1 {
    public void operation1() {
        System.out.println("D operation1");
    }

    public void operation2() {
        System.out.println("D operation2");
    }

    public void operation3() {
        System.out.println("D operation3");
    }

    public void operation4() {
        System.out.println("D operation4");
    }

    public void operation5() {
        System.out.println("D operation5");
    }

}

class A {
    public void depend1(Interface1 i) {
        i.operation1();
    }

    public void depend2(Interface1 i) {
        i.operation2();
    }

    public void depend3(Interface1 i) {
        i.operation3();
    }
}

class C {
    public void depend1(Interface1 i) {
        i.operation1();
    }

    public void depend4(Interface1 i) {
        i.operation4();
    }

    public void depend5(Interface1 i) {
        i.operation5();
    }
}