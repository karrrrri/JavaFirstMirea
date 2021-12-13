package ru.mirea.task25;

abstract class Decorator {
    Shape shape;
    public Decorator(Shape shape) { this.shape = shape; }
    public abstract void draw();
}

interface Shape { public void draw(); }

class RedDecorator extends Decorator {
    public RedDecorator(Shape shape) { super(shape); }

    public void draw() { shape.draw(); }
    void setRedBorder() { System.out.println("Red border"); }
}

class Circle implements Shape {
    public void draw() { System.out.println("Circle"); }
}

class Rectangle implements Shape {
    public void draw() { System.out.println("Rectangle"); }
}

class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape r = new Rectangle();
        Shape c = new Circle();
        RedDecorator rsd = new RedDecorator(r);
        RedDecorator csd = new RedDecorator(c);

        rsd.setRedBorder();
        rsd.draw();
        System.out.println();
        csd.setRedBorder();
        csd.draw();
    }
}
