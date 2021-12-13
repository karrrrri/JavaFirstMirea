package ru.mirea.task2;

public class Dog {
    private String name;
    private String bread;

    public Dog(String n, String b) {
        name = n;
        bread = b;
    }

    public String getName() {
        return name;
    }

    public String getBread() {return bread;}

    public static void main(String[] args) {
        Dog d1 = new Dog("Локи", "Лабрадор" );
        System.out.println("Имя собаки: " + d1.getName() + " Порода собаки: " + d1.getBread());
    }
}
