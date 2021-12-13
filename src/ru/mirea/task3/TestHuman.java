package ru.mirea.task3;

public class TestHuman {
    public static void main(String[] args){
        Human p1 = new Human("broun", 39, 18.5);
        System.out.println("Hair color " + p1.getHead() + " Leg size " + p1.getLeg() + " Hand size " + p1.getHand());
    }
}
