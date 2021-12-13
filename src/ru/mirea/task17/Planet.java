package ru.mirea.task17;

import java.util.Scanner;

enum Planets {
    Mercury(3.302e23, 2440), Venus(4.869e24, 6052), Earth(5.974e24, 6378), Mars(6.419e23, 3397),
    Jupiter(1.899e27, 71490), Saturn(5.685e26, 60270), Uranus(8.685e25, 25560), Neptune(1.024e26, 24760);
    private double weight;
    private double radius;
    private double G = 6.674;

    Planets(double m, double r) {
        weight = m;
        radius = r;
    }

    public double Gravity() {
        return (G * weight) / (radius * radius) / 1000000;
    }
}

public class Planet {
    public static void main(String[] args) {
        int planet;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the planet: ");
        for(int i = 0; i < 8; i++){
            System.out.println(i + ". " + Planets.values()[i].name());
        }
        planet = sc.nextInt();
        System.out.println("Planet: " + Planets.values()[planet].name());
        System.out.println("Gravity: " + Planets.values()[planet].Gravity());
    }
}