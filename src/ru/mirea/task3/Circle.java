package ru.mirea.task3;

public class Circle {
    private double rad;
    private String color;

    public Circle() {
        rad = 1.0;
        color = "red";
    }
    public Circle(double r) {
        rad = r;
        color = "red";
    }
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
