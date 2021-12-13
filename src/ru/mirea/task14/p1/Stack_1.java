package ru.mirea.task14.p1;

import java.util.Scanner;
import java.util.Stack;

public class Stack_1 {
    Stack<Integer> player1 = new Stack<Integer>();
    Stack<Integer> player2 = new Stack<Integer>();
    Stack<Integer> temp = new Stack<Integer>();
    int tp0, tp1, tp2, counter = 0;

    public Stack_1() {
        Scanner in = new Scanner(System.in);

        for(int i = 0; i < 5; i++) {
            tp0 = in.nextInt();
            if(tp0 == 0) {
                temp.push(10);
            }
            else {
                temp.push(tp0);
            }
        }
        for(int i = 0; i < 5; i++) {
            player1.push(temp.pop());
        }

        for(int i = 0; i < 5; i++) {
            tp0 = in.nextInt();
            if(tp0 == 0) {
                temp.push(10);
            }
            else {
                temp.push(tp0);
            }
        }
        for(int i = 0; i < 5; i++) {
            player2.push(temp.pop());
        }

        while(player1.size() != 10 && player2.size() != 10 && counter <= 106) {
            tp1 = player1.pop();
            tp2 = player2.pop();
            if(tp1 < tp2) {
                while(!player2.isEmpty()) {
                    temp.push(player2.pop());
                }
                player2.push(tp2);
                player2.push(tp1);
                while(!temp.isEmpty()) {
                    player2.push(temp.pop());
                }
            }
            else {
                while(!player1.isEmpty()) {
                    temp.push(player1.pop());
                }
                player1.push(tp2);
                player1.push(tp1);
                while(!temp.isEmpty()) {
                    player1.push(temp.pop());
                }
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
        new Stack_1();
    }
}