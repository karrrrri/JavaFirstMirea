package ru.mirea.task14.p2;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;

public class Queue_2 {
    Queue<Integer> player1 = new LinkedList<>();
    Queue<Integer> player2 = new LinkedList<>();
    int tp0, tp1, tp2, counter = 0;

    public Queue_2() {
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
            tp1 = player1.poll();
            tp2 = player2.poll();
            if(tp1 < tp2) {
                player2.add(tp1);
                player2.add(tp2);
            }
            else {
                player1.add(tp1);
                player1.add(tp2);
            }
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

    public static void main(String[] args){
        new Queue_2();
    }
}