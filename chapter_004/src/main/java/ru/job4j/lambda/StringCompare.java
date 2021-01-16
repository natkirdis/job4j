package ru.job4j.lambda;

import java.util.Comparator;

public class StringCompare {
    // Компаратор для сортировки строк

    /**
     * Компаратор для сортировки строк по алфавиту
     */
    Comparator<String> cmpText = (left, right) -> left.compareTo(right);

    /**
     * Компаратор для сортировки строк по убыванию длины строки
     */
    Comparator<String> cmpDescSize = (left, right) -> left.length() - right.length();

}