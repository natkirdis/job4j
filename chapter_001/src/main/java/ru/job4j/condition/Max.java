package ru.job4j.condition;

public class Max {
    public static int max(int first, int second) {
        int result = first > second ? first : second;
        return result;
    }

    public static int max(int first, int second, int third) {
        int result = max(first, second);
        result = max(result, third);
        return result;
    }

    public static int max(int first, int second, int third, int fourth) {
        int result = max(first, second, third);
        result = max(result, fourth);
        return result;
    }
}