package ru.job4j.array;

public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[]{5, 3, 2, 1, 4};
        for (int i = 0; i < array.length; i++) {
            for (int index = 1; index < array.length - i; index++) {
                if (array[index - 1] > array[index]) {
                    int temp = array[index];
                    array[index] = array[index - 1];
                    array[index - 1] = temp;
                }
            }
        }

        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}