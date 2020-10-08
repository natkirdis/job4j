package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length - 1; index++) {
            String cell = array[index];
            int notNullIndex = index + 1;
            if (cell == null) {
                while ((notNullIndex < array.length - 1) && (array[notNullIndex] == null)) {
                    notNullIndex += 1;
                }
                array[index] = array[notNullIndex];
                array[notNullIndex] = null;
            }
            System.out.print(array[index] + " ");
        }
        return array;
    }


    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}