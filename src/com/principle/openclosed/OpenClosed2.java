package com.principle.openclosed;

public class OpenClosed2 {
    public static void main(String[] args) {
        GraphicEditor2 ge = new GraphicEditor2();
        ge.drawShape(new Rectangle2());
        ge.drawShape(new Circle2());
        ge.drawShape(new Triangle2());

    }
}

abstract class Shape2 {
    int m_type;

    public abstract void draw();
}

class Rectangle2 extends Shape2 {
    public Rectangle2() {
        super.m_type = 1;
    }

    public void draw() {
        System.out.println("画矩形");
    }
}

class Circle2 extends Shape2 {
    public Circle2() {
        super.m_type = 2;
    }

    public void draw() {
        System.out.println("画圆形");
    }

}

class Triangle2 extends Shape2 {
    public Triangle2() {
        super.m_type = 3;
    }

    public void draw() {
        System.out.println("画三角形");
    }

}

// 加一种图形只需要加一个类继承Shape方法，不用改drawShape方法
class GraphicEditor2 {
    public void drawShape(Shape2 s) {
        s.draw();
    }
}