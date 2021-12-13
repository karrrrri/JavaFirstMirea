package ru.mirea.task28;

public class Auto {
    Marque marque;
    int price;
    int year;

    public Auto(Marque marque, int year, int price) {
        this.price = price;
        this.year = year;
        this.marque = marque;
    }

    public void info() { System.out.println("Basic Auto\nPrice: " + price + "\nMarque: " + marque.marque + " " + marque.country); }

    private static class Marque {
        String marque;
        String country;

        public Marque(String country, String marque) {
            this.marque = marque;
            this.country = country;
        }
    }

    public static void main(String[] args) {
        Auto auto1 = new Auto(new Marque("Germany", "Porsche Taycan"), 2019, 12000000) {
            public void info() { System.out.println("Auto1\nPrice: " + price + "\nMarque: " + marque.marque + " " + marque.country); }
        };
        auto1.info();

        Auto auto2 = new Auto(new Marque("Korea", "KIA K4"), 2021, 2100000);
        auto2.info();
    }
}