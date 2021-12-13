package ru.mirea.task23;

public class HashCode {
    public static void main(String[] args) {;
        String str_1 = "Object_1";
        String str_2 = "Object_1";
        String str_3 = "Object_3";
        String str_4 = "Object_4";
        String str_5 = "Object_5";

        System.out.print(str_1.hashCode() + " " + str_2.hashCode() + " : ");
        System.out.println(str_1.hashCode() == str_2.hashCode());
        System.out.print(str_2.hashCode() + " " + str_3.hashCode() + " : ");
        System.out.println(str_2.hashCode() == str_3.hashCode());
        System.out.print(str_3.hashCode() + " " + str_4.hashCode() + " : ");
        System.out.println(str_3.hashCode() == str_4.hashCode());
        System.out.print(str_4.hashCode() + " " + str_5.hashCode() + " : ");
        System.out.println(str_4.hashCode() == str_5.hashCode());
    }
}
