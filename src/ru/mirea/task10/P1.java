package ru.mirea.task10;
import java.util.Scanner;

public class P1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        P1.Rec(n);
    }

    private static void Rec(int n){
        int result = 1;
        int k = 1;

        if (n - k >= 0) {
            for (int i = k; i >= k; i--) {
                System.out.print(k);
            }
            k++;
        }
        Rec(n -= k);

    }
}
