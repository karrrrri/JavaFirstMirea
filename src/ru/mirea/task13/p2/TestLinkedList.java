package ru.mirea.task13.p2;

import java.util.LinkedList;
import java.util.Collections;

public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> test = new LinkedList<Integer>();

        for(int i = 0; i < 5; i++) {
            test.add(i);
        }
        for(int i = 0; i < test.size(); i++) {
            System.out.print(test.get(i) + " ");
        }
        System.out.print("\n");
        test.addFirst(17);
        test.set(1, 14);

        for(int i = 0; i < test.size(); i++) {
            System.out.print(test.get(i) + " ");
        }
        System.out.print("\n");

        Collections.sort(test);

        for(int i = 0; i < test.size(); i++) {
            System.out.print(test.get(i) + " ");
        }
    }
}