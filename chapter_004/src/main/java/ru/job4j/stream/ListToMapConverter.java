package ru.job4j.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMapConverter {
    public static Map<String, Student> convertListToMap(List<Student> students) {
        return students.stream()
                .distinct()
                .collect(Collectors.toMap(
                        Student::getSurname,
                        student -> student
                ));
    }

    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student(25, "Ivanov"),
                new Student(15, "Petrov"),
                new Student(15, "Smirnov"),
                new Student(15, "Petrov")
        );

        convertListToMap(students).forEach((k, v) -> System.out.println("Key: " + k + " Value: " + v));
    }
}
