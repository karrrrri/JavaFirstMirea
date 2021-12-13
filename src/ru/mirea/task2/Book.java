package ru.mirea.task2;

public class Book {
    private String name;
    private int page;

    public Book(String n, int p) {
        name = n;
        page = p;
    }

    public String getName() {
        return name;
    }

    public int getPage() {return page;}

    public static void main(String[] args) {
        Book b1 = new Book("<<Мастер и Маргарита>>", 256 );
        System.out.println("Название книги " + b1.getName() + " Количество страниц = " + b1.getPage());
    }
}