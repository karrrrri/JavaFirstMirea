package ru.mirea.task5;
import java.util.Scanner;

public class TestFurniture {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите тип мебели (1 - Стул; 2 - Стол; 3 - Диван): ");
        int type = in.nextInt();
        if (type == 1){
            System.out.println("Введите цвет стула : ");
            String ck = in.next();
            System.out.println("Введите материал стула : ");
            String mk = in.next();
            System.out.println("Введите количество стульев : ");
            int kk = in.nextInt();
            Furniture k = new Chairs(ck, mk, kk);
            System.out.println(k);
        }
        else
        if (type == 2){
            System.out.println("Введите цвет стола : ");
            String ct = in.next();
            System.out.println("Введите материал стола : ");
            String mt = in.next();
            System.out.println("Введите количество столов : ");
            int kt = in.nextInt();
            Furniture t = new Tables(ct, mt, kt);
            System.out.println(t);
        }
        else
        if (type == 3) {
            System.out.println("Введите цвет дивана : ");
            String cl = in.next();
            System.out.println("Введите материал дивана : ");
            String ml = in.next();
            System.out.println("Введите количество диванов : ");
            int kl = in.nextInt();
            Furniture l = new Divans(cl, ml, kl);
            System.out.println(l);
        }
        else
            System.out.println("Введено некорректное число");
    }
}
