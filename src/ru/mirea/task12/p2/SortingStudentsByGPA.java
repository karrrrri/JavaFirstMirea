package ru.mirea.task12.p2;

import java.util.LinkedList;

public class SortingStudentsByGPA implements Comp<Student> {
    public int compare(Student a, Student b) {
        return Integer.compare(a.score, b.score);
    }
    public SortingStudentsByGPA(LinkedList<Student> list, int leftBorder, int rightBorder){
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        Student pivot = list.get((leftMarker + rightMarker) / 2);
        do {
            while (compare(list.get(leftMarker), pivot) > 0) {
                leftMarker++;
            }
            while (compare(list.get(rightMarker), pivot) < 0) {
                rightMarker--;
            }
            if (leftMarker <= rightMarker) {
                if (leftMarker < rightMarker) {
                    Student tmp = list.get(leftMarker);
                    list.set(leftMarker, list.get(rightMarker));
                    list.set(rightMarker, tmp);
                }
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);
        if (leftMarker < rightBorder) {
            new SortingStudentsByGPA(list, leftMarker, rightBorder);
        }
        if (leftBorder < rightMarker) {
            new SortingStudentsByGPA(list, leftBorder, rightMarker);
        }
    }

    public static void main(String[] args) {
        LinkedList<Student> students = new LinkedList<Student>();
        students.add(new Student(15));
        students.add(new Student(33));
        students.add(new Student(58));
        students.add(new Student(90));
        students.add(new Student(34));
        students.add(new Student(2));
        students.add(new Student(29));
        for (Student student : students) {
            System.out.print(student.score + " ");
        }
        System.out.print("\n");

        new SortingStudentsByGPA(students, 0, students.size()-1);

        for (Student student : students) {
            System.out.print(student.score + " ");
        }
    }
}
