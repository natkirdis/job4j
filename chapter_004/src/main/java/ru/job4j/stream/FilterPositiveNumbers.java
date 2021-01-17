package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;

public class FilterPositiveNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, -5, 0, 11);
        List<Integer> positiveNumbers = numbers.stream().filter(x -> x > 0)
                .collect(Collectors.toList());
        positiveNumbers.forEach(System.out::println);
    }
}