package ru.mirea.task6;

public class TestPriceable implements Priceable{
    public void getPrice(){
        System.out.println(2500000);
    }
    public static void main(String[] args){
        TestPriceable c1 = new TestPriceable();
        c1.getPrice();
    }
}
