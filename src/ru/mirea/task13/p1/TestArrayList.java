package ru.mirea.task13.p1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TestArrayList {
    public static void main(String[] args) {

        String yellow = new String("Yellow");
        String green = new String("green");
        String red = new String("red");
        String white = new String("white");
        String black = new String("black");
        String orange = new String("orange");
        String gray = new String("gray");
        String blue = new String("blue");

        ArrayList<String> colors = new ArrayList<>(Arrays.asList(yellow,green,red,white,black,orange,gray,blue));
        Collections.sort(colors);
        System.out.println(colors);
        System.out.println(Collections.max(colors));
        System.out.println(Collections.min(colors));
        Collections.reverse(colors);
        System.out.println(colors);
        Collections.shuffle(colors);
        System.out.println("Перемешанный список:"+colors);

    }
}