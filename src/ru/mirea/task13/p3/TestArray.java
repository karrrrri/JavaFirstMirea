package ru.mirea.task13.p3;

import java.util.Collections;

public class TestArray {
    public static void main(String[] args) {
        ArrayList<Integer> test = new ArrayList<>();

        for(int i = 0; i < 5; i++) {
            test.add(i);
        }
        for(int i = 0; i < test.size(); i++) {
            System.out.print(test.get(i) + " ");
        }
        System.out.print("\n");
        test.set(1, 14);
        test.remove(2);

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