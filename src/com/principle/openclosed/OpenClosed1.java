package com.principle.openclosed;

public class OpenClosed1 {
    public static void main(String[] args) {
        GraphicEditor ge = new GraphicEditor();
        ge.drawShape(new Rectangle());
        ge.drawShape(new Circle());
        ge.drawShape(new Triangle());

    }
}

class Shape {
    int m_type;
}

class Rectangle extends Shape {
    public Rectangle() {
        super.m_type = 1;
    }
}

class Circle extends Shape {
    public Circle() {
        super.m_type = 2;
    }
}

class Triangle extends Shape {
    public Triangle() {
        super.m_type = 3;
    }
}

// 加一种图形要改方法
class GraphicEditor {
    public void drawShape(Shape s) {
        if (s.m_type == 1) {
            drawRectangle(s);
        } else if (s.m_type == 2) {
            drawCircle(s);
        } else if (s.m_type == 3) {
            drawTriangle(s);
        }
    }

    public void drawRectangle(Shape r) {
        System.out.println("画矩形");
    }

    public void drawCircle(Shape c) {
        System.out.println("画圆形");
    }

    public void drawTriangle(Shape c) {
        System.out.println("画三角形");
    }
}