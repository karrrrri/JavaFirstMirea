package ru.mirea.task20;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class CreateDate {
    long getMlsc(String date_str) {
        long mlsc = -1;
        SimpleDateFormat a = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        try {
            Date date = a.parse(date_str);
            mlsc = date.getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return mlsc;
    }

    public Date build(String date_str) {
        Date date;
        long mlsc = getMlsc(date_str);
        date = new Date(mlsc);
        return date;
    }

    public static void main(String[] args) {
        String lastName;
        String receiptDateStr;

        System.out.println("Enter date in format: yyyy-MM-dd HH:mm");
        Scanner scanner = new Scanner(System.in).useDelimiter("\\n");;
        String dateString = scanner.next();

        CreateDate t_date = new CreateDate();
        Date date = t_date.build(dateString);
        System.out.println(date);
    }
}
