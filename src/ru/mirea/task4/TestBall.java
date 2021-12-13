package ru.mirea.task4;
import java.util.Scanner;

public class TestBall {
    public static void main(String[] args){
        double xSd , ySd ;
        Scanner in = new Scanner(System.in);
        Ball yellow = new Ball();
        System.out.println("Введите смещение по х: ");
        xSd = in.nextDouble();
        System.out.println("Введите смещение по y: ");
        ySd = in.nextDouble();
        System.out.println("Изначальные координаты:" + yellow.getX() + ","+ yellow.getY() + "\n Координаты после сдвига: " + yellow.moveX(xSd) + "," + yellow.moveY(ySd));

    }
}
