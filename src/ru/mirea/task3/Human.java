package ru.mirea.task3;

public class Human {
    private
    String head;
    int leg;
    double hand;

    public Human (String hd, int l, double hn){
        head = hd;
        leg = l;
        hand = hn;
    }
    public double getHand() {
        return hand;
    }
    public String getHead() {
        return head;
    }
    public int getLeg() {
        return leg;
    }
}
