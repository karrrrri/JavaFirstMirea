package ru.mirea.task1;

public class p4 {
    public static void main(String[] arg) {
        System.out.println("Аргументов в командной строке: " + arg.length);
        for (int i = 0; i < arg.length; i++) {
            System.out.println("Hello," + arg[i] + "!");
        }
    }
}
