package ru.job4j.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMapConverter {
    public static Map<String, Student> convertListToMap(List<Student> students) {
        return students.stream()
                .collect(Collectors.toMap(
                        Student::getSurname,
                        student -> student,
                        (student1, student2) -> student1
                ));
    }

    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student(25, "Ivanov"),
                new Student(22, "Petrov"),
                new Student(17, "Smirnov"),
                new Student(15, "Petrov")
        );

        convertListToMap(students).forEach((k, v) -> System.out.println("Key: " + k + " Value: " + v));
    }
}
