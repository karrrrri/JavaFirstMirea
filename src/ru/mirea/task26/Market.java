package ru.mirea.task26;

import java.util.Scanner;

interface Payment { public void pay(String product); }

class Wallet implements Payment {
    public void pay(String product) {
        System.out.println("Your order has been paid by an wallet!");
    }
}

class Credit implements Payment {
    public void pay(String product) {
        System.out.println("Your order has been paid by a credit card");
    }
}

class Market {
    String product, wallet;
    Scanner sc = new Scanner(System.in);

    public void start() {
        System.out.println("Enter product name:");

        product = sc.nextLine();
        System.out.println("You've chosen a " + product);
        System.out.print("Choose the way to pay your order: ");
        wallet = sc.nextLine();

        switch (wallet) {
            case "wallet":
                Payment e_wallet = new Wallet();
                e_wallet.pay(product);
                break;

            case "credit":
                Payment credit = new Credit();
                credit.pay(product);
                break;

            default:
                System.out.println("Error! This type of payment isn't supported!");
                break;
        }

        return;
    }
}

class Test {
    public static void main(String[] args) {
        Market mp = new Market();
        mp.start();
    }
}