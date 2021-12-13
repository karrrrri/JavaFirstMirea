package ru.mirea.task14.p5;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;

public class Interactive_5 {
    Queue<Integer> player1 = new LinkedList<>();
    Queue<Integer> player2 = new LinkedList<>();
    int tp0, tp1, tp2, counter = 0;

    public Interactive_5() {
        Scanner in = new Scanner(System.in);

        for(int i = 0; i < 5; i++) {
            tp0 = in.nextInt();
            if(tp0 == 0) {
                player1.add(10);
            }
            else {
                player1.add(tp0);
            }
        }

        for(int i = 0; i < 5; i++) {
            tp0 = in.nextInt();
            if(tp0 == 0) {
                player2.add(10);
            }
            else {
                player2.add(tp0);
            }
        }

        while(player1.size() != 10 && player2.size() != 10 && counter <= 106) {
            System.out.println("Round " + (counter+1) + ":");

            tp1 = player1.poll();
            tp2 = player2.poll();

            drawCards(tp1, tp2);

            if(tp1 < tp2) {
                System.out.println("Player 2 win");
                player2.add(tp1);
                player2.add(tp2);
            }
            else {
                System.out.println("Player 1 win");
                player1.add(tp1);
                player1.add(tp2);
            }
            System.out.println("Player 1 have " + player1.size() + "cards");
            System.out.println("Player 2 have " + player2.size() + "cards");
            pressAnyKeyToContinue();
            counter++;
        }
        if(counter > 106) {
            System.out.print("botva");
        }
        else {
            if (player1.size() == 10) {
                System.out.print("first " + counter);
            }
            else {
                System.out.print("second " + counter);
            }
        }
    }

    private void pressAnyKeyToContinue() {
        System.out.println("Press Enter key to continue...");
        try
        {
            System.in.read();
        }
        catch(Exception e)
        {}
    }

    private void drawCards(int value1, int value2) {
        String horizontalBorder = "-------";
        String verticalBorder = "|     |";

        System.out.println(horizontalBorder + "\t" + horizontalBorder);

        for (int i = 0; i < 3; i++) {
            if (i == 1) {
                System.out.println("|  " + value1 + "  |\t|  " + value2 + "  |");

            }
            else
                System.out.println(verticalBorder + "\t" + verticalBorder);
        }
        System.out.println(horizontalBorder + "\t" + horizontalBorder);
    }

    public static void main(String[] args){
        new Interactive_5();
    }
}
