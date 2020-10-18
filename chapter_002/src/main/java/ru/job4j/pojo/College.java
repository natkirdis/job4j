package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Pavlova Maria Alekseevna");
        student.setGroupNumber(127);
        student.setEntry(new Date());

        System.out.println(student.getFullName() + " studies in group № " + student.getGroupNumber());
    }
}