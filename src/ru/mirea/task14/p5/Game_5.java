package ru.mirea.task14.p5;

import java.util.Stack;


import java.util.ArrayList;
import java.util.Scanner;

abstract class Game{
    void start() {
        ArrayList<String> allCards = getUserCards();
        fillDecks(allCards);

        getWinner();
    }

    ArrayList<String> getUserCards() {
        Scanner scanner = new Scanner(System.in);

        String cards1 = scanner.nextLine();
        String cards2 = scanner.nextLine();

        ArrayList<String> allCards = new ArrayList<String>();
        allCards.add(cards1);
        allCards.add(cards2);

        return allCards;
    }

    ArrayList<String> getTestCards() {
        String cards1 = "13579"; //reverse for queue
        String cards2 = "24680"; //reverse for queue

        ArrayList<String> allCards = new ArrayList<String>();
        allCards.add(cards1);
        allCards.add(cards2);

        return allCards;
    }

    String reverseStr(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    void fillDecks(ArrayList<String> allCards) {
        char[] str1 = reverseStr(allCards.get(0)).toCharArray();
        char[] str2 = reverseStr(allCards.get(1)).toCharArray();

        for (Character ch: str1)
            pushItemToDeckWithNum(1, ch);
        for (Character ch: str2)
            pushItemToDeckWithNum(2, ch);
    }

    abstract void pushItemToDeckWithNum(int n, char item);

    void getWinner() {
        char cardOfPl1;
        char cardOfPl2;

        int i = 0;

        while (i < 106) {
            if (areBothDecksEmpty()) {
                System.out.println("Error. Wrong card values.");
                System.exit(1);
            }

            else if (checkIfPl1WinsTheGame()) {
                System.out.println("first " + String.valueOf(i));
                return;
            }

            else if (checkIfPl2WinsTheGame()) {
                System.out.println("second " + String.valueOf(i));
                return;
            }

            cardOfPl1 = getTopOfDeckWithNum(1);
            cardOfPl2 = getTopOfDeckWithNum(2);

            if (checkIfPl1WinsInMove(cardOfPl1, cardOfPl2)) {
                pushUnderDeck(1, cardOfPl1, cardOfPl2);
            }
            else if (checkIfPl2WinsInMove(cardOfPl1, cardOfPl2)) {
                pushUnderDeck(2, cardOfPl2, cardOfPl1);
            }
            i++;
        }
        printDraw();
    }

    abstract boolean areBothDecksEmpty();

    boolean checkIfPl1WinsTheGame() {
        return isDeck2Empty();
    }

    boolean checkIfPl2WinsTheGame() {
        return isDeck1Empty();
    }

    abstract char getTopOfDeckWithNum(int num);

    abstract boolean isDeck1Empty();
    abstract boolean isDeck2Empty();

    boolean checkIfPl1WinsInMove(char cardOfPl1, char cardOfPl2) {
        return ((cardOfPl1 > cardOfPl2) && !(cardOfPl1 == '9' && cardOfPl2 == '0') ||
                (cardOfPl1 == '0' && cardOfPl2 == '9'));
    }

    boolean checkIfPl2WinsInMove(char cardOfPl1, char cardOfPl2) {
        return ((cardOfPl1 < cardOfPl2) && !(cardOfPl1 == '0' && cardOfPl2 == '9') ||
                (cardOfPl1 == '9' && cardOfPl2 == '0'));
    }

    abstract void pushUnderDeck(int deckNum, char card1, char card2);

    void printDraw() {
        System.out.println("botva");
    }
}




public class Game_5 extends Game {
    Stack<Character> player1Deck;
    Stack<Character> player2Deck;

    public Game_5() {
        player1Deck = new Stack<Character>();
        player2Deck = new Stack<Character>();
    }

    void drawCards(char value1, char value2) {
        String horizontalBorder = "+-----+";
        String verticalBorder = "|     |";

        System.out.println(horizontalBorder + "\t" + horizontalBorder);

        for (int i = 0; i < 3; i++) {
            if (i == 1) {
                StringBuilder val1Line = new StringBuilder(verticalBorder);
                val1Line.setCharAt(3,  value1);
                StringBuilder val2Line = new StringBuilder(verticalBorder);
                val2Line.setCharAt(3,  value2);
                System.out.println(val1Line + "\t" + val2Line);
            }
            else
                System.out.println(verticalBorder + "\t" + verticalBorder);
        }
        System.out.println(horizontalBorder + "\t" + horizontalBorder);
    }

    @Override
    void pushItemToDeckWithNum(int n, char item) {
        if (n == 1)
            player1Deck.push(item);
        else if (n == 2)
            player2Deck.push(item);

        else {
            String noDeckErrMsg = "Error: no deck with num " + item + ".";
            throw new java.lang.Error(noDeckErrMsg);
        }
    }

    @Override
    void getWinner() {
        char cardOfPl1;
        char cardOfPl2;

        int i = 0;

        while (i < 106) {
            System.out.println("Step #" + i);

            if (areBothDecksEmpty()) {
                System.out.println("Error. Wrong card values.");
                System.exit(1);
            }

            else if (checkIfPl1WinsTheGame()) {
                System.out.println("First player won this game in " + String.valueOf(i) + " steps!!!");
                return;
            }

            else if (checkIfPl2WinsTheGame()) {
                System.out.println("Second player won this game in " + String.valueOf(i) + " steps!!!");
                return;
            }

            cardOfPl1 = getTopOfDeckWithNum(1);
            cardOfPl2 = getTopOfDeckWithNum(2);

            drawCards(cardOfPl1, cardOfPl2);

            if (checkIfPl1WinsInMove(cardOfPl1, cardOfPl2)) {
                pushUnderDeck(1, cardOfPl1, cardOfPl2);
                System.out.println("Player 1 won this move!");
            }
            else if (checkIfPl2WinsInMove(cardOfPl1, cardOfPl2)) {
                pushUnderDeck(2, cardOfPl2, cardOfPl1);
                System.out.println("Player 2 won this move!");
            }
            System.out.println("Player 1 have " + player1Deck.size() + " cards");
            System.out.println("Player 2 have " + player2Deck.size() + " cards");
            System.out.println("\n");
            i++;
        }
        printDraw();
    }

    @Override
    boolean areBothDecksEmpty() {
        return (player1Deck.empty() && player2Deck.empty());
    }

    @Override
    char getTopOfDeckWithNum(int num) {
        if ((num == 1) && !(player1Deck.empty()))
            return player1Deck.pop();
        else if ((num == 2) && !(player2Deck.empty()))
            return player2Deck.pop();

        throw new java.lang.Error("Error: unable to get top item of stack (stack is empty).");
    }

    @Override
    boolean isDeck1Empty() {
        return player1Deck.empty();
    }

    @Override
    boolean isDeck2Empty() {
        return player2Deck.empty();
    }

    void pushUnderDeck(int deckNum, char card1, char card2) {
        Stack<Character> deck;

        if (deckNum == 1)
            deck = this.player1Deck;
        else if (deckNum == 2)
            deck = this.player2Deck;
        else
            return;

        Stack<Character> temp = (Stack<Character>)deck.clone();

        deck.clear();

        deck.push(card2);
        deck.push(card1);

        deck.addAll(temp);
    }

    public static void main(String[] args) {
        Game game = new Game_5();
        game.start();
    }
}