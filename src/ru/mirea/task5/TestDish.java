package ru.mirea.task5;
import java.util.Scanner;

public class TestDish {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите тип посуды (1 - Кружка; 2 - Тарелка; 3 - Ложка): ");
        int type = in.nextInt();
        if (type == 1){
            System.out.println("Введите цвет кружки : ");
            String ck = in.next();
            System.out.println("Введите материал кружки : ");
            String mk = in.next();
            System.out.println("Введите количество кружек : ");
            int kk = in.nextInt();
            Dish k = new Mugs(ck, mk, kk);
            System.out.println(k);
        }
        else
            if (type == 2){
                System.out.println("Введите цвет тарелки : ");
                String ct = in.next();
                System.out.println("Введите материал тарелки : ");
                String mt = in.next();
                System.out.println("Введите количество тарелок : ");
                int kt = in.nextInt();
                Dish t = new Plates(ct, mt, kt);
                System.out.println(t);
            }
            else
                if (type == 3) {
                    System.out.println("Введите цвет ложки : ");
                    String cl = in.next();
                    System.out.println("Введите материал ложки : ");
                    String ml = in.next();
                    System.out.println("Введите количество ложек : ");
                    int kl = in.nextInt();
                    Dish l = new Spoons(cl, ml, kl);
                    System.out.println(l);
                }
                else
                    System.out.println("Введено некорректное число");
    }
}
