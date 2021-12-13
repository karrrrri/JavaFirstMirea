package ru.mirea.task1;
import java.util.Scanner;
import java.util.*;
public class p7 {
    public static void main(String[] args){
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        n = in.nextInt();
        System.out.println(calculateFactorial(n));
    }

    static int calculateFactorial(int n){
        int res = 1;
        for (int i = 1; i <= n; i++){
            res *= i;
        }
        return res;
    }
}
