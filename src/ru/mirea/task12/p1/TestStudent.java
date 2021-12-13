package ru.mirea.task12.p1;

import java.util.ArrayList;

public class TestStudent{
    public  TestStudent(ArrayList<Student> students) {

        for (int i = 0; i < students.size(); i++) {
            System.out.print(students.get(i).iDNumber + " ");
        }
        System.out.print("\n");
        for (int i = 0; i < students.size(); i++) {
            int value = students.get(i).iDNumber;
            int j = i - 1;
            for (; j >= 0; j--) {
                if (value < students.get(j).iDNumber) {
                    students.get(j + 1).iDNumber = students.get(j).iDNumber;
                } else {
                    break;
                }
            }
            students.get(j + 1).iDNumber = value;
        }
        for (int i = 0; i < students.size(); i++) {
            System.out.print(students.get(i).iDNumber + " ");
        }
    }

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student(57));
        students.add(new Student(44));
        students.add(new Student(37));
        students.add(new Student(99));
        students.add(new Student(15));
        students.add(new Student(22));
        new TestStudent(students);
    }
}
