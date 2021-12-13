package ru.mirea.task12.p3;

import ru.mirea.task12.p1.Student;

import java.util.LinkedList;

public class TestStudent{
    LinkedList<Student> studentsm;
    public TestStudent(LinkedList<Student> students1, LinkedList<Student> students2) {
        for (int i = 0; i < students1.size(); i++) {
            System.out.print(students1.get(i).iDNumber + " ");
        }
        System.out.print("\n");

        for (int i = 0; i < students2.size(); i++) {
            System.out.print(students2.get(i).iDNumber + " ");
        }
        System.out.print("\n");

        studentsm = new LinkedList<Student>(students1);
        studentsm.addAll(students2);
        StudentTest(studentsm,0, students1.size()*2-1);

        for (int i = 0; i < studentsm.size(); i++) {
            System.out.print(studentsm.get(i).iDNumber + " ");
        }
    }

    public static void StudentTest(LinkedList<Student> source, int left, int right) {
        int delimiter = left + ((right - left) / 2) + 1;
        if (delimiter > 0 && right > (left + 1)) {
            StudentTest(source, left, delimiter - 1);
            StudentTest(source, delimiter, right);
        }
        LinkedList<Student> buffer = new LinkedList<Student>();
        int cursor = left;
        for (int i = 0; i < right-left+1; i++) {
            if (delimiter > right || source.get(cursor).iDNumber > source.get(delimiter).iDNumber) {
                if(buffer.size() < i+1){
                    buffer.add(source.get(cursor));
                } else{
                    buffer.set(i, source.get(cursor));
                }
                cursor++;
            } else {
                if(buffer.size() < i+1){
                    buffer.add(source.get(delimiter));
                } else{
                    buffer.set(i, source.get(delimiter));
                }
                delimiter++;
            }
        }
        for(int i = 0; i < right-left+1; i++){
            source.set(i+left, buffer.get(i));
        }
    }

    public static void main(String[] args) {
        LinkedList<Student> students1 = new LinkedList<Student>();
        students1.add(new Student(30));
        students1.add(new Student(91));
        students1.add(new Student(17));
        students1.add(new Student(82));
        students1.add(new Student(58));
        students1.add(new Student(21));

        LinkedList<Student> students2 = new LinkedList<Student>();
        students2.add(new Student(20));
        students2.add(new Student(19));
        students2.add(new Student(54));
        students2.add(new Student(22));
        students2.add(new Student(45));
        students2.add(new Student(99));


        new TestStudent(students1, students2);

    }
}