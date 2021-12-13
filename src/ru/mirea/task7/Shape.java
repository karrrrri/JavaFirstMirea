package ru.mirea.task7;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape(){}
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    public String getColor(){return color;}
    public void setColor(String color){this.color = color;}
    public boolean isFilled(){return filled;}
    public void setFilled(boolean filled){this.filled = filled;}

    public abstract double getArea();
    public abstract double getPerimetr();
    public abstract String toString();
}
class Circle extends Shape{
    protected double radius;

    public Circle(){}
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }
    public double getRadius(){return radius;}
    public void setRadius(double radius){this.radius = radius;}

    @Override
    public double getArea(){
        return Math.PI*radius*radius;
    }
    @Override
    public double getPerimetr() {
        return Math.PI * 2 * radius;
    }
    @Override
    public String toString(){
        return "Shape: circle, radius: "+this.radius+", color: "+this.color+", perimetr: "+this.getPerimetr()+", area: "+this.getArea();
    }

}
class Rectangle extends Shape{
    protected double width;
    protected double length;

    public Rectangle(){
        this.filled = false;
        this.color = "yellow";
        width = 5;
        length = 4;
    }
    public Rectangle(double width, double length){
        this.filled = true;
        this.color = "yellow";
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled){
        this.filled = filled;
        this.color = color;
        this.width = width;
        this.length = length;
    }
    public double getWidth(){return width;}
    public void setWidth(double width){this.width = width;}
    public double getLength(){return length;}
    public void setLength(double length){this.length = length;}
    @Override
    public double getArea(){
        return width*length;
    }
    @Override
    public double getPerimetr(){
        return 2*(width+length);
    }
    @Override
    public String toString(){
        return "Shape: rectangle, width: "+this.width+", length: "+this.length+", perimetr: "+this.getPerimetr()+", area: "+this.getArea();
    }
}
class Square extends Rectangle{
    protected double side;
    public Square(){
        this.filled = true;
        this.color = "red";
        double side = 5;
    }
    public Square(double side){
        this.filled = false;
        this.color = "green";
        this.width = side;
    }
    public Square(double side, String color, boolean filled){
        this.filled = filled;
        this.color = color;
        this.width = side;
    }
    public double getSide(){return side;}
    public void setSide(double side){this.side = side;}
    @Override
    public void setWidth(double side){this.width = side;}
    @Override
    public void setLength(double side){this.length = side;}
    @Override
    public String toString(){
        return "Shape: square, side: "+this.getSide()+", color: "+this.color;
    }
}
