package com.principle.liskov;

public class Liskov2 {
    public static void main(String[] args) {
        A2 a = new A2();
        System.out.println("11-3=" + a.func1(11, 3));
        System.out.println("1-8=" + a.func1(1, 8));
        System.out.println("-------------------------");
        B2 b = new B2();
        System.out.println("11-3=" + b.func3(11, 3));
        System.out.println("1-8=" + b.func3(1, 8));
        System.out.println("11+3=" + b.func1(11, 3));
        System.out.println("1+8=" + b.func1(1, 8));
        System.out.println("11+3+9=" + b.func2(11, 3));
    }
}

// 防止继承带来的入侵性，尽量不重写父类方法，
// 造一个更基础的父类调整类间的关系，用依赖，组合，聚合
class Base {

}

class A2 extends Base {
    public int func1(int x, int y) {
        return x - y;
    }
}

class B2 extends Base {
    private A2 a2 = new A2();

    public int func1(int x, int y) {
        return x + y;
    }

    public int func2(int x, int y) {
        return func1(x, y) + 9;
    }

    public int func3(int x, int y) {
        return this.a2.func1(x, y);
    }
}