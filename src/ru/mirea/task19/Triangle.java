package ru.mirea.task19;

import java.util.Scanner;

class InvalidAngleException extends Exception {
    public InvalidAngleException(String errorMessage)
    { super(errorMessage);}
}

public class Triangle {
    public float angle1, angle2, angle3;
    Triangle(float a1, float a2, float a3) throws InvalidAngleException {
        if ((a1 + a2 + a3 != 180) || ((a1 != 90) & (a2 != 90) & (a3 != 90))){
            throw new InvalidAngleException("Error. Incorrect angles");
        }
        else {
            angle1 = a1;
            angle2 = a2;
            angle3 = a3;
            System.out.println("Triangle successfully created");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the angles: ");
        int angle1 = sc.nextInt();
        int angle2 = sc.nextInt();
        int angle3 = sc.nextInt();
        try {
            Triangle triangle = new Triangle(angle1, angle2, angle3);
        } catch (InvalidAngleException exc) {
            exc.printStackTrace();
        }
    }
}
