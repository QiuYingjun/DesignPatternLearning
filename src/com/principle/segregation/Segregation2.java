package com.principle.segregation;

public class Segregation2 {
    public static void main(String[] args) {
        AA a = new AA();
        BB b = new BB();
        a.depend1(b);
        a.depend2(b);
        a.depend3(b);

        CC c = new CC();
        DD d = new DD();
        c.depend1(d);
        c.depend4(d);
        c.depend5(d);
    }
}

class BB implements Interface2_1, Interface2_23 {
    public void operation1() {
        System.out.println("BB operation1");
    }

    public void operation2() {
        System.out.println("BB operation2");
    }

    public void operation3() {
        System.out.println("BB operation3");
    }
}

class DD implements Interface2_1, Interface2_45 {
    public void operation1() {
        System.out.println("DD operation1");
    }

    public void operation4() {
        System.out.println("DD operation4");
    }

    public void operation5() {
        System.out.println("DD operation5");
    }
}

class AA {
    public void depend1(Interface2_1 i) {
        i.operation1();
    }

    public void depend2(Interface2_23 i) {
        i.operation2();
    }

    public void depend3(Interface2_23 i) {
        i.operation3();
    }
}

class CC {
    public void depend1(Interface2_1 i) {
        i.operation1();
    }

    public void depend4(Interface2_45 i) {
        i.operation4();
    }

    public void depend5(Interface2_45 i) {
        i.operation5();
    }
}