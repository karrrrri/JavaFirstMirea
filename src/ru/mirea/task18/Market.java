package ru.mirea.task18;

import java.util.Scanner;

public class Market {

    public static boolean isNumeric(String str)
    {
        return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
    }

    public void menu(){
        String tax_id;
        String name = "";
        System.out.println("Name and tax id:");
        try{
            Scanner sc = new Scanner(System.in);
            name = sc.nextLine();
            tax_id = sc.next();
            if ((tax_id.length() != 12) && !(isNumeric(tax_id))) throw new IllegalAccessException("Error. Incorrect tax id.");
        } catch(IllegalAccessException exc) {
            exc.printStackTrace();
            System.exit(-1);
        }
        System.out.println("Success." + name + ", your order has been submitted for processing");
    }

    public static void main(String[] args) {
        Market store = new Market();
        store.menu();
    }
}