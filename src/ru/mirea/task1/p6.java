package ru.mirea.task1;
import java.util.Scanner;
import java.util.*;
public class p6 {
    public static void main(String[] args){
        int n, array[];
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        n = in.nextInt();
        array = new int[n];
        for (int i = 0; i < array.length; i++)
            array[i] = (int) (Math.random() * n);
        for (int i : array)
            System.out.print(i + " ");
        Arrays.sort(array);
        System.out.print("\n");
        for (int i : array)
            System.out.print(i + " ");
    }
}
