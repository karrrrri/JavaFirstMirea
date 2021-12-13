package ru.mirea.task3;

public class Book {
    private
    String author;
    String name;
    int data;
    int page;

    public Book(String a, String n, int d, int p){
        author = a;
        name = n;
        data = d;
        page = p;
    }
    public int getData() {
        return data;
    }
    public String getAuthor() {
        return author;
    }
    public String getName() {
        return name;
    }
    public int getPage(){return page;}
}
