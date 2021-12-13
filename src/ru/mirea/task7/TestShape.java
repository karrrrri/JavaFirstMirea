package ru.mirea.task7;
import java.util.Scanner;

public class TestShape {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите тип фигуры(1 - Круг, 2 - Прямоугольник, 3 - Квадрат): ");
        int type = in.nextInt();
        if (type == 1){
            System.out.println("Введите цвет заливки: ");
            String ck = in.next();
            System.out.println("Заливать ли фигуру?(true/false)");
            boolean zk = in.nextBoolean();
            System.out.println("Введите радиус: ");
            double rk = in.nextDouble();
            Shape Circle = new Circle(rk,ck,zk);
            System.out.println(Circle);
        }
        else
            if (type == 2){
                System.out.println("Введите цвет заливки: ");
                String cp = in.next();
                System.out.println("Заливать ли фигуру?(true/false)");
                boolean zp = in.nextBoolean();
                System.out.println("Введите ширину: ");
                double wp = in.nextDouble();
                System.out.println("Введите длину: ");
                double lp = in.nextDouble();
                Shape Rectangle = new Rectangle(wp,lp,cp,zp);
                System.out.println(Rectangle);
            }
            else
                if (type == 3){
                    System.out.println("Введите цвет заливки: ");
                    String cc = in.next();
                    System.out.println("Заливать ли фигуру?(true/false)");
                    boolean zc = in.nextBoolean();
                    System.out.println("Введите длину стороны: ");
                    double sc = in.nextDouble();
                    Shape Square = new Square(sc,cc,zc);
                    System.out.println(Square);
                }
                else
                    System.out.println("Введено некорректное число");
        Shape s1 = new Circle(5.5, "RED", false); // Upcast Circle to Shape
        System.out.println(s1); // which version?
        System.out.println(s1.getArea()); // which version?
        //System.out.println(s1.getPerimeter()); // which version?
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        //System.out.println(s1.getRadius());
        Circle c1 = (Circle)s1; // Downcast back to Circle
        System.out.println(c1);
        System.out.println(c1.getArea());
        //System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());
        //Shape s2 = new Shape();
        Shape s3 = new Rectangle(1.0, 2.0, "RED", false); // Upcast
        System.out.println(s3);
        System.out.println(s3.getArea());
        //System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
        //System.out.println(s3.getLength());
        Rectangle r1 = (Rectangle)s3; // downcast
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());
        Shape s4 = new Square(6.6); // Upcast
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
        //System.out.println(s4.getSide());
        // Take note that we downcast Shape s4 to Rectangle,
        // which is a superclass of Square, instead of Square
        Rectangle r2 = (Rectangle)s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        //System.out.println(r2.getSide());
        System.out.println(r2.getLength());
        // Downcast Rectangle r2 to Square
        Square sq1 = (Square)r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());
        //В программе закомментированны строчки, которые вызывают ошибки
    }
}
