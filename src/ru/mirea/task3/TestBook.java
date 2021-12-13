package ru.mirea.task3;

public class TestBook {
    public static void main(String[] args){
        Book b1 = new Book("M.Bulgakov", "<<Master i Margarita>>", 1937, 256);
        System.out.println("Author:  " + b1.getAuthor() + "; Name: " + b1.getName() + "; Data: " + b1.getData()+ "; Pages: " +b1.getPage());
    }
}
