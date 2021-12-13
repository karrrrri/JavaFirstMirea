package ru.mirea.task2;

public class Circle {
    private double rad;
    private String color;

    public Circle(double r, String c) {
        rad = r;
        color = c;
    }
    public double getRadius() {
        return rad;
    }
    public String getColor() {
        return color;
    }
    public double getArea() {
        return rad * rad *Math.PI;
    }
}
