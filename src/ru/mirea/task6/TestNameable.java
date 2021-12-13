package ru.mirea.task6;

public class TestNameable implements Nameable{
    public void getName(){
        System.out.println("Меркурий");
    }

    public static void main(String[] args){
        TestNameable p1 = new TestNameable();
        p1.getName();
    }
}




