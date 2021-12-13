package ru.mirea.task20;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

class TaskList {
    String lastname;
    Calendar StartDate;
    Date FinishDate;

    TaskList(String lastname, Calendar startDate){
        this.lastname = lastname;
        this.StartDate = startDate;
    }

    public void FinishDate() { this.FinishDate = new Date(); }

    @Override
    public String toString() {
        return "Main{" +
                "lastname='" + lastname + '\'' +
                ", StartDate=" + StartDate +
                ", FinishDate=" + FinishDate +
                '}';
    }
}

class CreateCalendar {
    public Calendar build(String date_str) {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        try {
            SimpleDateFormat a = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            calendar.setTime(a.parse(date_str));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return calendar;
    }

    public static void main(String[] args) {
        String lastName;
        String receiptDateStr;

        System.out.println("Enter date in format: yyyy-MM-dd HH:mm");
        Scanner scanner = new Scanner(System.in).useDelimiter("\\n");

        String dateString = scanner.next();

        CreateCalendar t_calendar = new CreateCalendar();
        Calendar calendar = t_calendar.build(dateString);
        System.out.println(calendar);

        System.out.println("Name:");
        lastName = scanner.next();
        System.out.println("Enter date in format: yyyy-MM-dd HH:mm");
        receiptDateStr = scanner.next();

        CreateCalendar t_calendar_2 = new CreateCalendar();
        Calendar receiptDate = t_calendar_2.build(receiptDateStr);
        TaskList main = new TaskList(lastName, receiptDate);

        main.FinishDate();

        System.out.println(main);
    }
}