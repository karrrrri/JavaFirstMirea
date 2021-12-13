package ru.mirea.task1;
import java.util.Scanner;
public class p3 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int []mas = new int[10];
        int sum = 0;
        for (int i = 0; i<10; i++){
            mas[i] = s.nextInt();
            sum = sum + mas[i];
        }
        System.out.println("Sum = "+sum);
    }
}
